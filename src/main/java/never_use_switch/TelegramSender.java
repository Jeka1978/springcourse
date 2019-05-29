package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class TelegramSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println("telegram was sent: "+message.getContent());
    }

    @Override
    public String myCode() {
        return "3";
    }
}
