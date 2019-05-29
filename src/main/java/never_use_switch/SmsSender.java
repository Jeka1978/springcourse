package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("1")
public class SmsSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println("sms was sent: "+message.getContent());
    }
}
