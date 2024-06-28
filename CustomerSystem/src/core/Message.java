package core;

import javax.swing.*;

public class Message {

    public static void showFillMessage() {
        JOptionPane.showMessageDialog(
                null,
                "Please fill all field!",
                "ERROR",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void showDoneMessage() {
        JOptionPane.showMessageDialog(
                null,
                "Login successful.",
                "ERROR",
                JOptionPane.DEFAULT_OPTION
        );
    }

    public static void showEmailErrorMessage() {
        JOptionPane.showMessageDialog(
                null,
                "Invalid email address!",
                "ERROR",
                JOptionPane.WARNING_MESSAGE
        );
    }
}
