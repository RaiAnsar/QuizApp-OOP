package RaiAnsar.QuizApp;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel implements ActionListener {

    JLabel loginLabel;
    JLabel userLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField userTextField = new JTextField(20);
    JPasswordField passwordField = new JPasswordField(20);
    JButton loginButton = new JButton("LogIn");
    JButton clearButton = new JButton("Clear Fields");
    JCheckBox showPassword = new JCheckBox("Show Password");

    public LoginPanel() {
        setLayout(new GridBagLayout());
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);
        Border outerBound = BorderFactory.createEmptyBorder(1, 1, 1, 1);
        //setBorder(BorderFactory.createCompoundBorder(outerBound,innerBound));

        Border innerBorder = BorderFactory.createTitledBorder("Login Form: Quizzat");
        setBorder(BorderFactory.createCompoundBorder(outerBound, innerBorder));
        setBorder(innerBorder);
        addActionEvent();

        Initializer();
        setVisible(true);
    }

    public void Initializer() {
        GridBagConstraints constraints = new GridBagConstraints();
        {
            loginLabel = new JLabel(" Login Here.....");
            loginLabel.setFont(new Font("Dialog", Font.BOLD, 18));
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.weightx = 1;
            constraints.weighty = 1;
            constraints.insets = new Insets(0, 0, 0, -500);
            constraints.fill = GridBagConstraints.NONE;
            constraints.anchor = GridBagConstraints.CENTER;
            add(loginLabel, constraints);

        }
        {
            constraints.insets = new Insets(0, 0, 0, 0);
            constraints.gridx = 0;
            constraints.gridy = 1;
            constraints.weightx = 1;
            constraints.weighty = 0.4;
            constraints.fill = GridBagConstraints.CENTER;
            constraints.anchor = GridBagConstraints.LINE_END;
            add(userLabel, constraints);
            constraints.fill = GridBagConstraints.NONE;
            constraints.anchor = GridBagConstraints.LINE_START;
            constraints.weightx = 1;
            constraints.gridx = 1;
            add(userTextField, constraints);
        }
        {
            constraints.gridx = 0;
            constraints.gridy = 2;
            constraints.weightx = 1;
            constraints.weighty = 0.4;
            constraints.fill = GridBagConstraints.NONE;
            constraints.anchor = GridBagConstraints.LINE_END;
            add(passwordLabel, constraints);
            //constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.anchor = GridBagConstraints.LINE_START;
            constraints.weightx = 1;
            constraints.gridx = 1;
            add(passwordField, constraints);
        }
        {
            constraints.gridx = 1;
            constraints.gridy = 3;
            constraints.weightx = 1;
            constraints.weighty = 0.1;
            constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(-20, 90, 0, 0);
            //constraints.anchor = GridBagConstraints.NORTH;
            add(showPassword, constraints);

        }
        {
            constraints.gridx = 0;
            constraints.gridy = 4;
            constraints.weightx = 1;
            constraints.weighty = 4;
            // constraints.fill = GridBagConstraints.FIRST_LINE_START;
            constraints.anchor = GridBagConstraints.FIRST_LINE_END;
            constraints.insets = new Insets(20, 0, 0, -95);

            add(loginButton, constraints);
            constraints.anchor = GridBagConstraints.FIRST_LINE_START;
            constraints.gridx = 1;
            constraints.insets = new Insets(20, 105, 0, 0);
            add(clearButton, constraints);
        }


    }


    public void addActionEvent() {
        loginButton.addActionListener(this);
        clearButton.addActionListener(this);
        showPassword.addActionListener(this);
    }



    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("RaiAnsar") && pwdText.equalsIgnoreCase("weirdBuTtOk")) {
                JOptionPane.showMessageDialog(loginButton, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(loginButton, "Invalid Username or Password");
            }

        }
        if (e.getSource() == clearButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }
}












   // @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
//}


//    LoginPanel() {
//
//        setLocationAndSize();
//        addComponentsToContainer();
//        addActionEvent();
//
//    }
//
//
//
//    public void setLocationAndSize() {
//        userLabel.setBounds(50, 150, 100, 30);
//        passwordLabel.setBounds(50, 220, 100, 30);
//        userTextField.setBounds(150, 150, 150, 30);
//        passwordField.setBounds(150, 220, 150, 30);
//        showPassword.setBounds(150, 250, 150, 30);
//        loginButton.setBounds(50, 300, 100, 30);
//        resetButton.setBounds(200, 300, 100, 30);
//
//
//    }
//
//    public void addComponentsToContainer() {
//        add(userLabel);
//        add(passwordLabel);
//        add(userTextField);
//        add(passwordField);
//        add(showPassword);
//        add(loginButton);
//        add(resetButton);
//    }
//
//    public void addActionEvent() {
//        loginButton.addActionListener(this);
//        resetButton.addActionListener(this);
//        showPassword.addActionListener(this);
//    }
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == loginButton) {
//            String userText;
//            String pwdText;
//            userText = userTextField.getText();
//            pwdText = passwordField.getText();
//            if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
//                JOptionPane.showMessageDialog(this, "Login Successful");
//            } else {
//                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
//            }
//
//        }
//        if (e.getSource() == resetButton) {
//            userTextField.setText("");
//            passwordField.setText("");
//        }
//        if (e.getSource() == showPassword) {
//            if (showPassword.isSelected()) {
//                passwordField.setEchoChar((char) 0);
//            } else {
//                passwordField.setEchoChar('x');
//            }
//
//
//        }
//    }

