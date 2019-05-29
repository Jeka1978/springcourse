package never_use_switch;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class Distributer {

    private Map<String, Sender> map;

    public Distributer(List<Sender> senders) {
        map = senders.stream().collect(toMap(Sender::myCode, Function.identity()));
    }

    public void sendMessage(Message msg) {
        String type = msg.getDeliveryType();
        Sender sender = map.get(type);
        if (sender == null) {
            throw new RuntimeException(type + " not supported yet");
        }
        sender.send(msg);


    }
}
