package view;

import business.UserController;
import core.Helper;
import core.Message;
import entity.User;

import javax.swing.*;
import java.awt.*;

public class LoginUI extends JFrame {
    private JPanel container;
    private JPanel pnl_top;
    private JLabel lbl_title;
    private JPanel pnl_bottom;
    private JTextField fld_mail;
    private JButton btn_login;
    private JLabel lbl_mail;
    private JLabel lbl_password;
    private JPasswordField fld_password;
    private final UserController userController;

    public LoginUI() {

        this.userController = new UserController();

        this.add(container);
        this.setTitle("Customer Manage System");
        this.setSize(600, 600);
        this.setVisible(true);

        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2;

        this.setLocation(x, y);
        this.btn_login.addActionListener(e -> {
            JTextField[] fields = {this.fld_mail, this.fld_password};

            if (!Helper.isEmailValid(this.fld_mail.getText())) {
                Message.showEmailErrorMessage();
            } else if (Helper.isFieldListEmpty(fields)) {
                Message.showFillMessage();
            } else {
                User user = this.userController.findByLogin(this.fld_mail.getText(), this.fld_password.getText());
                if(user != null){
                    this.dispose();
                    DashboardUI dashboardUI = new DashboardUI(user);
                }else {
                    Message.showWrongDataMessage();
                }
            }
        });
    }
}
