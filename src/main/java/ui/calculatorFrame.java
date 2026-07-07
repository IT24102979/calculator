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
    }
}


