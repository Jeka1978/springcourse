package never_use_switch;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Builder
@Data
public class Person {
    private String name;
    private int age;
    @NonNull
    @Singular
    private Map<String,Integer> beers;

    @Singular("однаРыба")
    private List<String> fish;

}
