package never_use_switch;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class Distributer {
    public void sendMessage(Message msg) {
        String type = msg.getDeliveryType();
        switch (type) {
            case "1":
                //40 lines of code
                System.out.println("sms was sent with text: "+msg.getContent());
                break;
            case "2":

                // 35 lines of code
                System.out.println("whatsapp was sent with text: "+msg.getContent());

            //todo  remove switch
        }
    }
}
