package my_spring;

import lombok.Data;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Data
public class Elf {
    @InjectRandomInt(min=10,max=20)
    private int power;
    @InjectRandomInt(min=10,max=20)
    private int speed;


}
