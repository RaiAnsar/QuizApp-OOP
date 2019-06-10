package RaiAnsar.QuizApp;

import javax.swing.*;
import java.awt.*;
import java.nio.ByteOrder;

public class AppLabel extends JPanel {
    private ImageIcon quizzat;
    private JLabel appName;
    private JLabel appLogo;
    public AppLabel() {
        setSize(50, 50);
        setLayout(new GridLayout(1,3));
        setVisible(true);

        Dimension dimension = getPreferredSize();
        dimension.height = 100;
        setPreferredSize(dimension);
        //quizzat = new ImageIcon(getClass().getResource("QuizIcon-01.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);

        //add(appLogo, BorderLayout.CENTER);

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("QuizIcon-01.png")).getImage().getScaledInstance(220, 190, Image.SCALE_DEFAULT));
        appLogo = new JLabel(imageIcon);
        add(appLogo);
        add(new JLabel("QuizZat"));
        add(new JLabel("A Project by Rai Muhammad Ansar"));
        //add(appLogo);
//        GridBagConstraints constraints = new GridBagConstraints();
//        constraints.gridx = 0;
//        constraints.gridy = 0;
//        constraints.weightx = 1;
//        constraints.weighty = 1;
//        constraints.anchor = GridBagConstraints.CENTER;
//        constraints.fill = GridBagConstraints.NONE;

    }
}
