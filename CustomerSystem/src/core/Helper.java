package core;

import javax.swing.*;

public class Helper {
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

}