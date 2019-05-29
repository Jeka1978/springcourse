package my_spring;

import com.github.javafaker.Faker;
import com.github.javafaker.GameOfThrones;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomNameObjectConfigurator implements ObjectConfigurator {
    private Random random = new Random();
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                GameOfThrones gameOfThrones = new Faker().gameOfThrones();
                String name = gameOfThrones.character();
                field.setAccessible(true);
                field.set(t,name);
            }
        }
    }
}
