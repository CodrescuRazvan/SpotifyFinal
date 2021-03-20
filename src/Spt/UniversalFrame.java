package Spt;

import javax.swing.*;
import java.awt.*;

public class UniversalFrame extends JFrame {
    protected JPanel contentPanel;
    protected Color background = new Color(0, 110, 0);
    protected Color back = new Color(32, 32, 115);
    protected Font writing = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20);

    public UniversalFrame(String title) {
        FrameStack.getInstance().push(this);
        setTitle(title);
        setSize(900, 700);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);

        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBackground(background);
        add(contentPanel, BorderLayout.CENTER);
        //setVisible(true);

    }
}
