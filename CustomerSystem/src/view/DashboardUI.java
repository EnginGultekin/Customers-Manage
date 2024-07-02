package view;

import core.Message;
import entity.User;

import javax.swing.*;
import java.awt.*;

public class DashboardUI extends JFrame {
    private JPanel container;
    private  User user;

    public DashboardUI(User user) {
        this.user = user;
        if (user == null) {
            Message.showWErrorMessage();
            dispose();
        }
        this.add(container);
        this.setTitle("Customer Manage System");
        this.setSize(1000, 500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2;

        this.setLocation(x,y);
        this.setVisible(true);

        System.out.print(this.user.toString());

    }
}
