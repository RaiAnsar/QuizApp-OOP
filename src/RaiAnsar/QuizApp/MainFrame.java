package RaiAnsar.QuizApp;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JButton clickMe;
    private JPanel text;
//    private JPanel statusBar;
//    private JLabel appStatus;
//    private JLabel currentPage;
//    private JLabel correctQs, incorrectQs;


    public MainFrame(){
        super("Quizzat");
        Initializer();
        setVisible(true);
    }

    private void Initializer() {
        AppLabel appLabel = new AppLabel();
        QuizPanel quizPanel = new QuizPanel();
        ControlPanel controlPanel = new ControlPanel();
        InfoPanel infoPanel = new InfoPanel();
        StatusBar statusBar = new StatusBar();
        LoginPanel loginPanel = new LoginPanel();
        setSize(1369, 800);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        clickMe = new JButton("Click Me", new ImageIcon());

        add(statusBar, BorderLayout.SOUTH);
        add(appLabel, BorderLayout.NORTH);
        //add(loginPanel, BorderLayout.CENTER);
        add(quizPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.EAST);
        add(infoPanel, BorderLayout.WEST);




    }
}
