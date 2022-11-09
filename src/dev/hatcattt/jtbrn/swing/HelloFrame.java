package dev.hatcattt.jtbrn.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Basic swing windows.
 */
public class HelloFrame extends JFrame {

    public HelloFrame() {

        // init the windows
        super("My First Swing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null); // if null, the windows is in the center of the screen

        initComponent();

        setLayout(null);
        setVisible(true);
    }

    private void initComponent() {

//        // display some text
//        JLabel helloLabel = new JLabel("Hello Swing!");
////        helloLabel.setText("Hello Swing!");
//        helloLabel.setBounds(40, 20, 100, 30); // (x, y, width, height)
//        add(helloLabel);

        // set an input text field
        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(160,20, 100,30);
        add(nameTextField);

        // add a panel (mini JFrame)
        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(40,150,220,70);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setBackground(Color.GREEN);
        add(greenPanel);

        // adding some text to a new label
        JLabel helloLabel = new JLabel("Hello");
        helloLabel.setBounds(50,20, 100,30);
        helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        helloLabel.setVerticalAlignment(SwingConstants.CENTER);

        Font font = new Font("Courier", Font.BOLD,12);
        helloLabel.setFont(font);
        helloLabel.setFont(helloLabel.getFont().deriveFont(16f)); // increase the font size to 16

        greenPanel.add(helloLabel); // adding label to the panel

        // add a button component
        JButton acceptButton = new JButton("Accept");
        acceptButton.setBounds(100, 70, 100, 30);
        add(acceptButton);

        // add text to the text label when wy push the accept button
        acceptButton.addActionListener(e -> {
            String helloText = "Hello";
            String name = nameTextField.getText();
            if (name != null && name.trim().length() > 0) {
                helloText += String.format(", %s", name);
            }
            helloLabel.setText(helloText);
            System.out.println("The button is clicked!");
        });
    }

    public static void main(String[] args) throws Exception {
        // override
//        Runnable initFrame = new Runnable() {
//            @Override
//            public void run() {
//                new HelloFrame();
//            }
//        };

        // lambda expression
//        Runnable initFrame = () -> new HelloFrame();

        // methode reference
//        Runnable initFrame = HelloFrame::new;
//        SwingUtilities.invokeAndWait(initFrame);

        // anonymous class (call constructor)
        new HelloFrame();
    }
}