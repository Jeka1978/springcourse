package real_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Sql
public class PrintStringHandler implements Handler {
    @Override
    public void handle(String str) {
        System.out.println(str);
    }
}
