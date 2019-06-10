package RaiAnsar.QuizApp;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    String[] diffLevels = {"Any", "Easy", "Medium", "Hard"};
    JComboBox difficulty;
    JButton nextQuestion;
    JButton prevQuestion;
    JButton finishQuiz;

    public ControlPanel(){
        super();
        Dimension dimension = getPreferredSize();
        dimension.width =140;
        setPreferredSize(dimension);
        setLayout(new GridBagLayout());
        setVisible(true);
        Initializer();

    }

    private void Initializer() {
        difficulty = new JComboBox(diffLevels);
        nextQuestion = new JButton("\u25C4");
        prevQuestion = new JButton( "\u25BA");
        finishQuiz = new JButton(" Submit ");

        GridBagConstraints qC = new GridBagConstraints();
        qC.gridx = 0;
        qC.gridy = 0;
        qC.weightx = 1;
        qC.weighty = 2;
        qC.fill = GridBagConstraints.NONE;
        qC.anchor = GridBagConstraints.ABOVE_BASELINE;
        add(new JLabel("Difficulty: "));
        qC.gridx = 1;
        add(difficulty, qC);



    }
}
