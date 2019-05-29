package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurator {
    Object configureProxy(Object t, Class type);
}
