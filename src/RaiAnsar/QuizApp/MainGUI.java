package RaiAnsar.QuizApp;

import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame {
    private JButton clickMe;
    private JPanel text;
    private JPanel statusBar;
    private JTextArea appStatus;
    private JTextArea currentPage;
    private JTextArea correctQs, incorrectQs;


    public MainGUI(){
        super("Quizzat");
        Initializer();
        setVisible(true);
    }

    private void Initializer() {
        setSize(800, 600);
        setLayout(new BorderLayout());
        clickMe = new JButton("Click Me", new ImageIcon());
        appStatus = new JTextArea("App is Running");
        currentPage = new JTextArea("Main Screen");
        correctQs = new JTextArea(" Correct: 4"); incorrectQs = new JTextArea("Incorrect: 2");
        statusBar = new JPanel(new GridLayout(0, 4));
        statusBar.add(appStatus); statusBar.add(currentPage); statusBar.add(correctQs); statusBar.add(incorrectQs);
        add(statusBar, BorderLayout.SOUTH);



        add(clickMe, BorderLayout.CENTER);




    }
}
