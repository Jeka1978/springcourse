package my_spring;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object configureProxy(Object t, Class type) {
        if (type.isAnnotationPresent(Benchmark.class)) {
            return Enhancer.create(type, new InvocationHandler() {
                @Override
                public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                    System.out.println("**********BENCHMARK started for method "+method.getName()+" ************");
                    long start = System.nanoTime();
                    Object retVal = method.invoke(t, args);
                    long end = System.nanoTime();
                    System.out.println(end-start);
                    System.out.println("**********BENCHMARK ended for method "+method.getName()+" ************");
                    return retVal;
                }
            });
        }else {
            return t;
        }

    }
}
