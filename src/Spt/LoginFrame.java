package Spt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginFrame extends UniversalFrame{
    private static JButton loginButton;


    private static JTextField usernameTF;
    private static JTextField passwordTF;

    private static JLabel usernameLabel;
    private static JLabel passwrodLabel;

    private static JLabel userMessage;
    private static JLabel loginError;

    public LoginFrame(String title) {
        super(title);

        contentPanel.setLayout(null);

        JPanel panelLeft = new JPanel();
        panelLeft.setBackground(new Color(0, 110, 0));
        panelLeft.setBounds(10, 11, 237, 339);
        panelLeft.setLayout(null);
        panelLeft.setBackground(background);
        contentPanel.add(panelLeft);

        JPanel panelRight = new JPanel();
        panelRight.setBounds(247, 11, 403, 339);
        panelRight.setBackground(Color.YELLOW);
        panelRight.setLayout(null);
        panelRight.setBackground(background);
        contentPanel.add(panelRight);

        userMessage = new JLabel("Spotify Account");
        userMessage.setFont(new Font("Times Nes Roman", Font.BOLD | Font.ITALIC, 22));
        userMessage.setHorizontalAlignment(SwingConstants.CENTER);
        userMessage.setBounds(110, 38, 180, 40);
        userMessage.setVisible(true);
        panelRight.add(userMessage);

        usernameLabel = new JLabel("User: ");
        usernameLabel.setBounds(10, 128, 80, 38);
        usernameLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        usernameLabel.setVisible(true);
        panelRight.add(usernameLabel);

        usernameTF = new JTextField();
        usernameTF.setBounds(110, 128, 200, 35);
        usernameTF.setColumns(10);
        usernameTF.setFont(writing);
        usernameTF.setVisible(true);
        panelRight.add(usernameTF);

        passwrodLabel = new JLabel("Password: ");
        passwrodLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        passwrodLabel.setBounds(10, 203, 100, 38);
        passwrodLabel.setVisible(true);
        panelRight.add(passwrodLabel);

        passwordTF = new JPasswordField();
        passwordTF.setBounds(110, 203, 200, 38);
        passwordTF.setColumns(10);
        passwordTF.setFont(writing);
        passwordTF.setVisible(true);
        panelRight.add(passwordTF);

        loginError = new JLabel("Username sau parola gresita...");
        loginError.setBounds(45, 255, 300, 25);
        loginError.setBackground(background);
        loginError.setForeground(back);
        loginError.setVisible(false);
        loginError.setFont(writing);
        loginError.setHorizontalAlignment(SwingConstants.CENTER);
        panelRight.add(loginError);

        loginButton = new JButton("Log in");
        loginButton.setBounds(160, 285, 100, 40);
        loginButton.setBackground(background);
        loginButton.setFont(writing);
        loginButton.setHorizontalTextPosition(SwingConstants.CENTER);
        loginButton.setVisible(true);
        panelRight.add(loginButton);


    }

    public void setLoginButtonActionListener(ActionListener actionListener) {
        loginButton.addActionListener(actionListener);
    }

    public static JButton getLoginButton() {
        return loginButton;
    }

    public static JTextField getUsernameTF() {
        return usernameTF;
    }

    public static JTextField getPasswordTF() {
        return passwordTF;
    }

    public static JLabel getUsernameLabel() {
        return usernameLabel;
    }

    public static JLabel getPasswrodLabel() {
        return passwrodLabel;
    }

    public static JLabel getUserMessage() {
        return userMessage;
    }

    public static JLabel getLoginError() {
        return loginError;
    }

    public static String getUsernameInput() {
        return usernameTF.getText();
    }

    public static String getPasswordInput() {
        return passwordTF.getText();
    }
}