package my_spring;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class PopupSpeakre implements Speaker {
    @Override
    public void speak(String message) {
        JOptionPane.showInputDialog(message);
    }
}
