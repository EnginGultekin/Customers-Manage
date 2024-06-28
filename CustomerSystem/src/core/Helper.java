package core;

import javax.swing.*;
import java.util.regex.Pattern;

public class Helper {

    // Programme Theme Func
    public static void setTheme() {
        // UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if (info.getName().equals("Nimbus")) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException |
                         InstantiationException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }

    // Field Control Func
    public static boolean isFieldEmpty(JTextField field) {
        return field.getText().trim().isEmpty();
    }

    // Fields Control Func
    public static boolean isFieldListEmpty(JTextField[] fields) {
        for (JTextField field : fields) {
            if (isFieldEmpty(field)) return false;
        }
        return true;
    }

    // IsValid Email Func
    public static boolean isEmailValid(String email) {
        //invalid characters and invalid order
        final String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        return Pattern.compile(regexPattern)
                .matcher(email)
                .matches();
    }
}
