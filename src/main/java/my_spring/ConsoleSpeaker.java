package my_spring;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public class ConsoleSpeaker implements Speaker {
    public void speak(String message) {
        System.out.println(message);
    }
}
