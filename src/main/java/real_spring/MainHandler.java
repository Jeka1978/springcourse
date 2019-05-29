package real_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Component
public class MainHandler {
    @Autowired
    @HBase
    private List<Handler> handlers;

    public void handle(String str) {
        handlers.forEach(handler -> handler.handle(str));
    }
}
