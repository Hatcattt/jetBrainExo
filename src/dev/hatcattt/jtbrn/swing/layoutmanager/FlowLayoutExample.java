package dev.hatcattt.jtbrn.swing.layoutmanager;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

    public FlowLayoutExample() {
        setTitle("FlowLayoutExample");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        add(new JButton("First"));
        add(new JButton("Second"));
        add(new JTextField("Enter your text here"));
        add(new JLabel("This is a long label"));
        add(new JButton("Third"));

        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
