package ui;

import javax.swing.*;
import java.awt.*;

public class calculatorFrame {
    public void Frame() {
        //Create the frame
        JFrame frame = new JFrame("Calculator");

        //when the frame close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Size the frame
        frame.pack();

        //sets size 400 X 600
        frame.setSize(400,600);

        //show the frame
        frame.setVisible(true);

        //create a text filed
        JTextField inputField = new JTextField("0");
        inputField.setBounds(800,100,1000,300);

        inputField.setEditable(true);
        inputField.setFont(new Font("Arial",Font.BOLD,50));
        inputField.setHorizontalAlignment(JTextField.CENTER);
        frame.add(inputField);

        //create a panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(inputField);

        frame.add(panel);




    }
}


