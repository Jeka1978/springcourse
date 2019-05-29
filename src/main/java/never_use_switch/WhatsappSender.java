package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WhatsappSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println("whasapp was sent: "+message.getContent());
    }

    @Override
    public String myCode() {
        return "2";
    }
}
