package real_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@HBase
public class PrintStringUppercaseHandler implements Handler {
    @Override
    public void handle(String str) {
        System.out.println(str.toUpperCase());
    }
}
