package dev.hatcattt.tictactoe;

import dev.hatcattt.jtbrn.swing.PrintLog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Class used as a button and extend the JButton class.
 */
class BoxButton extends JButton {
    private String fullName;
    private String shortName;

    /**
     * Init a BoxButton with no argument (base JButton) with the name "Button".
     */
    public BoxButton() {
        this.fullName = "Button";
        setName(fullName);
    }

    /**
     * Init a BoxButton with a short name.
     * The full name of the button after will be "Button" + short name.
     * @param shortName the short name of the button.
     */
    public BoxButton(String shortName) {
        if (shortName != null) {
            this.shortName = shortName;
            fullName = "Button" + this.shortName;
            setBoxFont(new Font(Font.SANS_SERIF, Font.BOLD, 80));
        }
    }

    /**
     * Set the font of this button.
     * @param font the font to apply
     */
    public void setBoxFont(Font font) {
        if (font != null) {
            setFont(font);
        }
    }

    public String getFullName() {
        return fullName;
    }
    public String getShortName() {
        return shortName;
    }
}

/**
 * Represent the main board game panel.
 * This class extend the JPanel component and have a GridLayout.
 */
class Board extends JPanel {
    private final static int SIZE = 3;
    // further, maybe a new Board class who can have multiple size like a BoardExtended class
    private final List<BoxButton> boxButtonsList = new ArrayList<>();

    /**
     * This board panel have a GridLayout component with the size of 3 * 3.
     */
    public Board() {
        setLayout(new GridLayout(SIZE, SIZE));

        for (int i = SIZE; i >= 1; i--) {
            boxButtonsList.add(new BoxButton("A" + i));
            boxButtonsList.add(new BoxButton("B" + i));
            boxButtonsList.add(new BoxButton("C" + i));
        }
        boxButtonsList.forEach(this::add);
    }

    /**
     * Get the list of all BoxButton added in this JPanel.
     * @return a BoxButton list
     */
    public List<BoxButton> getBoxButtonsList() {
        return boxButtonsList;
    }
}

class FooterBox extends JPanel {
    Label gameActivity = new Label("Game is not started.");
    public JButton resetButton = new JButton("Reset");
    public FooterBox() {
        add(gameActivity);
        add(resetButton);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
    }
}

/**
 * Class used to initialise the main JFrame component.
 */
public class TicTacToe extends JFrame {

    public TicTacToe() {
        super("Tic Tac Toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        add(new Board());
        add(new FooterBox(), BorderLayout.SOUTH);
        setVisible(true);
    }
}
