package dev.hatcattt.tictactoe.main;

import dev.hatcattt.tictactoe.gui.BoxButton;
import dev.hatcattt.tictactoe.gui.PlayerLetters;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Represent the main board game panel.
 * This class extend the JPanel component and have a GridLayout of 3*3 size.
 */
public class Board extends JPanel {
    private final static int SIZE = 3;
    // further, maybe a new Board class who can have multiple size like a BoardExtended class
    private final static List<BoxButton> boxButtonsList = new ArrayList<>();
    static {
        for (int i = SIZE; i >= 1; i--) {
            boxButtonsList.add(new BoxButton("A" + i));
            boxButtonsList.add(new BoxButton("B" + i));
            boxButtonsList.add(new BoxButton("C" + i));
        }
    }

    /**
     * Init the board and all the button associated.
     * This board panel have a GridLayout component with the size of 3 * 3.
     */
    public Board() {
        setLayout(new GridLayout(SIZE, SIZE));
        boxButtonsList.forEach(this::add);
        boxButtonsList.forEach(B -> B.addActionListener(event -> boxButtonListener(B)));
    }

    private void boxButtonListener(JButton button) {
        if (button.getText().isEmpty()) {
            button.setText(PlayerLetters.getLetter());
        }
    }

    /**
     * Get the list of all BoxButton added in this JPanel Board.
     * @return a BoxButton list
     */
    public static List<BoxButton> getBoxButtonsList() {
        return boxButtonsList;
    }

}
