package real_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class Conf {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        context.getBean(MainHandler.class).handle("Java");
    }
}
