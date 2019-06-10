package RaiAnsar.QuizApp;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.net.URL;
import java.net.URLConnection;

public class StatusBar extends JPanel{
    private JLabel appStatus;
    private JLabel currentPage;
    private JLabel correctQs, incorrectQs;

    public StatusBar() {
        Initializer();
    }
    public void Initializer(){
        appStatus = new JLabel("Connection: "+internetCheck());
        currentPage = new JLabel("Panel: Main Screen ");
        correctQs = new JLabel(" Correct: 4"); incorrectQs = new JLabel("Incorrect: 2");
        Border innerBound = BorderFactory.createEtchedBorder();
        Border outerBound = BorderFactory.createEmptyBorder(1,1,1,1);
        setBorder(BorderFactory.createCompoundBorder(outerBound,innerBound));
        setLayout(new GridLayout(0, 4));
        appStatus.setBorder(BorderFactory.createCompoundBorder(outerBound, innerBound));
        currentPage.setBorder(BorderFactory.createCompoundBorder(outerBound, innerBound));
        correctQs.setBorder(BorderFactory.createCompoundBorder(outerBound, innerBound));
        incorrectQs.setBorder(BorderFactory.createCompoundBorder(outerBound, innerBound));

        add(appStatus); add(currentPage); //add(correctQs); add(incorrectQs);
    }

    // A method to check if website is up and computer is connected to internet.
        public String internetCheck()
        {
            try {
                URL url = new URL("https://opentdb.com/");
                URLConnection connection = url.openConnection();
                connection.connect();
                System.out.println("Connection Successful");
                return "Established";
            }
            catch (Exception e) {
                System.out.println("Internet Not Connected");
                return "Failed";
            }
        }
    }

