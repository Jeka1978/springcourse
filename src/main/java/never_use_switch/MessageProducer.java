package never_use_switch;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class MessageProducer {
    private final Distributer distributer;
    private final Faker faker;
    private Random random = new Random();



    @Scheduled(fixedDelay = 500)
    public void produceMsg() {
        String quote = faker.gameOfThrones().quote();
        int i = random.nextInt(3) + 1;
        Message message = Message.builder().content(quote).deliveryType(String.valueOf(i)).build();
        distributer.sendMessage(message);
    }
}













