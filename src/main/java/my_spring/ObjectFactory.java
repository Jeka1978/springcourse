package my_spring;

import com.github.javafaker.Faker;
import com.github.javafaker.GameOfThrones;
import lombok.SneakyThrows;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        T t = type.newInstance();


        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                GameOfThrones gameOfThrones = new Faker().gameOfThrones();
                String name = gameOfThrones.character();
                field.setAccessible(true);
                field.set(t,name);
            }
        }


        return t;
    }












}
