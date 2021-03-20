package Spt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    protected JFrame frame;
    private Color wrongData = new Color(107, 4, 0);
    private Color validData = new Color(240, 230, 140);



    public Login(LoginFrame frame) {
        this.frame = frame;
        frame.setLoginButtonActionListener(new LoginBtnActionListener());
    }

    private class LoginBtnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (LoginFrame.getUserMessage().getText().equals("Spotify Account")) {
                String username = LoginFrame.getUsernameInput();
                String password = LoginFrame.getPasswordInput();
                String[] possibleUser = Users.getUser_username();
                String[] possiblePaswwords = Users.getPasswords();
                boolean okUser = false;
                int userIndex = -1;
                for (int i = 0; i < possibleUser.length; i++) {
                    if (possibleUser[i].equals(username)) {
                        okUser = true;
                        userIndex = i;
                        break;
                    }
                }
                if (okUser) {
                    LoginFrame.getUsernameTF().setBackground(validData);
                    if (possiblePaswwords[userIndex].equals(password)) {
                        LoginFrame.getUsernameTF().setText("");
                        LoginFrame.getPasswordTF().setText("");
                        LoginFrame.getLoginError().setVisible(false);
                        LoginFrame.getPasswordTF().setBackground(validData);
                        new UserController(new UserFrame("User Menu"));
                    } else {
                        LoginFrame.getLoginError().setVisible(true);
                        LoginFrame.getPasswordTF().setBackground(wrongData);
                    }
                } else {
                    LoginFrame.getLoginError().setVisible(true);
                    LoginFrame.getUsernameTF().setBackground(wrongData);
                }
            }
        }
    }
}
