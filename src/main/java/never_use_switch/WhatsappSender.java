package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("2")
public class WhatsappSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println("whasapp was sent: "+message.getContent());
    }
}
