package core;

import javax.swing.*;

public class Message {

    public static void showFillMessage() {
        JOptionPane.showMessageDialog(
                null,
                "Please fill all field!",
                "MISSING DATA",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void showDoneMessage() {
        JOptionPane.showMessageDialog(
                null,
                "Login successful.",
                "",
                JOptionPane.DEFAULT_OPTION
        );
    }

    public static void showEmailErrorMessage() {
        JOptionPane.showMessageDialog(
                null,
                "Invalid email address!",
                "WARNING",
                JOptionPane.WARNING_MESSAGE
        );
    }

    public static void showWrongDataMessage() {
        JOptionPane.showMessageDialog(
                null,
                "Invalid email address or password!",
                "WRONG DATA",
                JOptionPane.ERROR_MESSAGE
        );
    }

    public static void showWErrorMessage() {
        JOptionPane.showMessageDialog(
                null,
                "User not found!",
                "ERROR",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
