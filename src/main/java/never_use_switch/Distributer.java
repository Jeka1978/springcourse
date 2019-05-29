package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class Distributer {

    @Autowired
    private Map<String,Sender> map;




    public void sendMessage(Message msg) {
        String type = msg.getDeliveryType();
        Sender sender = map.get(type);
        if (sender == null) {
            throw new RuntimeException(type + " not supported yet");
        }
        sender.send(msg);




    }
}
