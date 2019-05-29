package my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ElfTest {

    @Test
    public void injectRandomIntIsWorking() {
        Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
        System.out.println(elf);
        Assert.assertNotEquals(0, elf.getPower());
        Assert.assertNotEquals(0, elf.getSpeed());
    }
}