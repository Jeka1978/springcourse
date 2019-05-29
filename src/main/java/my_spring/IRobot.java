package my_spring;

import java.rmi.dgc.DGC;

/**
 * @author Evgeny Borisov
 */
public class IRobot {
    @InjectByType  //@Autowired
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;


    public IRobot() {
        System.out.println(cleaner.getClass().getName());
    }

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
