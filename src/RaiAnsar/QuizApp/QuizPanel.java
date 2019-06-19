package RaiAnsar.QuizApp;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizPanel extends JPanel implements ActionListener {
    //JPanel centerPanel;
    JPanel questionPanel;
    JLabel question;
    JLabel questionExtended;
    JRadioButton ans1, ans2, ans3, ans4;
    JPanel answerGrid;
    ButtonGroup ansButtons;
    JPanel answesPanel;

    JButton nextQuestion;
    JButton prevQuestion;
    JButton finishQuiz;
    JPanel buttonPanel;

    public QuizPanel(){
        setVisible(true);
        setLayout(new GridBagLayout());
//        Dimension dimension = getPreferredSize();
//        dimension.width = 250;
//        setPreferredSize(dimension);
        Border innerBorder = BorderFactory.createTitledBorder("Quiz Type: Science Quiz");
        setBorder(innerBorder);
        Initializer();

    }

    public void Initializer(){
        questionPanel = new JPanel(new GridBagLayout());
//        questionPanel.setMinimumSize(new Dimension(500, 200));
//        questionPanel.setMaximumSize(new Dimension(600, 300));
        GridBagConstraints qC = new GridBagConstraints();

        Questions questions = new Questions(1); // for now only
        System.out.println("another Null" + questions.getQuestion());
        question =new JLabel();
        questionExtended =new JLabel();
        question.setFont(new Font("Dialog", Font.BOLD, 18));
        questionExtended.setFont(new Font("Dialog", Font.BOLD, 20));
        if(questions.getQuestion().length()<75){

            question.setText(questions.getQuestion());
        } else {
            question.setText(questions.getQuestion().substring(0, 75)+"-");
            questionExtended.setText(questions.getQuestion().substring(75));
        }
        System.out.println(questions.getQuestion().length());

        ansButtons = new ButtonGroup();
        ans1 = new JRadioButton("A: "+questions.getAns1(), false);
        ans2 = new JRadioButton("B: "+questions.getAns2(), false);
        ans3 = new JRadioButton("C: "+questions.getAns3(), false);
        ans4 = new JRadioButton("D: "+questions.getAns4(), false);
        ansButtons.add(ans1); ansButtons.add(ans2); ansButtons.add(ans3); ansButtons.add(ans4);
        answerGrid = new JPanel(new GridBagLayout());

        buttonPanel = new JPanel(new GridBagLayout());
        nextQuestion = new JButton("\u25C4");
        prevQuestion = new JButton( "\u25BA");
        finishQuiz = new JButton(" Submit ");
        nextQuestion.addActionListener(this);
        prevQuestion.addActionListener(this);
        finishQuiz.addActionListener(this);
        {
            //adding in Question Panel
            qC.gridx = 0;
            qC.gridy = 0;
            qC.weightx = 1;
            qC.weighty = 1;
           // qC.anchor = GridBagConstraints.CENTER;
            qC.fill = GridBagConstraints.NONE;
            questionPanel.add((question), qC);
            qC.gridy = 1;

            questionPanel.add(questionExtended, qC);
        }
        {
            //adding 4 Options to answerGrid ;-)
            qC.gridx = 0; qC.gridy = 1; qC.weightx = 1; qC.weighty = 1;
            qC.fill = GridBagConstraints.NONE;
            qC.anchor = GridBagConstraints.LINE_START;

            answerGrid.add(ans1, qC);
            qC.anchor = GridBagConstraints.LINE_START;
            qC.gridy = 2;
            answerGrid.add(ans2, qC);
            qC.anchor = GridBagConstraints.LINE_START;
            qC.gridy = 3;
            answerGrid.add(ans3, qC);
            qC.anchor = GridBagConstraints.LINE_START;
            qC.gridy = 4;
            answerGrid.add(ans4, qC);
        }


        {
            //Button Panel
            qC.gridx = 0;
            qC.gridy = 0;
            qC.weightx = 1;
            qC.weighty = 1;
            qC.anchor = GridBagConstraints.CENTER;
            qC.fill = GridBagConstraints.NONE;
            qC.insets = new Insets(0, 0 , 0 , 100);
            buttonPanel.add(nextQuestion, qC);
            qC.gridx = 1;
            qC.insets = new Insets(0, 0 , 0 , 0);
            buttonPanel.add(finishQuiz, qC);
            qC.gridx = 2;
            qC.insets = new Insets(0, 100 , 0 , 0);
            buttonPanel.add(prevQuestion, qC);

        }
        {
            //adding in Main Panel
            qC.gridx = 0;
            qC.gridy = 0;
            qC.weightx = 1;
            qC.weighty = 1;
            qC.anchor = GridBagConstraints.CENTER;
            qC.fill = GridBagConstraints.NONE;

            add(questionPanel, qC);
            qC.gridy = 1;
            add(answerGrid, qC);
            qC.gridy = 2;
            add(buttonPanel, qC);
        }



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}




























