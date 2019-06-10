package RaiAnsar.QuizApp;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {
    private JLabel studentName;
    private JLabel studentID;
    private JLabel instructorName;
    private JLabel score;



    public InfoPanel(){
        super();
        Dimension dimension = getPreferredSize();
        dimension.width =250;
        setPreferredSize(dimension);
        setLayout(new GridLayout(3,1));
        setVisible(true);
        Initializer();

    }

    private void Initializer() {


        GridBagConstraints qC = new GridBagConstraints();
        qC.gridx = 0;
        qC.gridy = 0;
        qC.weightx = 4;
        qC.weighty = 4;
        qC.fill = GridBagConstraints.NONE;




    }
}

