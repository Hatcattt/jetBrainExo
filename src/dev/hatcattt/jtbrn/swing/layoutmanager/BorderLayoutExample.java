package dev.hatcattt.jtbrn.swing.layoutmanager;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    public BorderLayoutExample() {
        super("Border Layout");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        // setLayout(new BorderLayout(5, 5)); gap
        setLayout(new BorderLayout());

        // make 2 buttons in NORTH
        // and change de layout with a box layer
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
        panel.add(new JButton("One"));
        panel.add(new JButton("Two"));

        add(panel, BorderLayout.NORTH);
//        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(final String[] args) {
        new BorderLayoutExample();
    }
}
