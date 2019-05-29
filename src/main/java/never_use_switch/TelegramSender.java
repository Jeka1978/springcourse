package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("3")
public class TelegramSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println("telegram was sent: "+message.getContent());
    }
}
