package dev.hatcattt.tictactoe.gui;

import dev.hatcattt.tictactoe.main.Board;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

/**
 * Reset the Board box buttons list to empty string.
 */
public class ButtonReset extends JButton {
    private final String name = "Reset";

    public ButtonReset() {
        super.setName(name);
        super.setText(name);
        this.addActionListener(e -> resetButtonText());
    }

    private void resetButtonText() {
        for (var B : Board.getBoxButtonsList()) {
            B.setText("");
        }
    }
}
