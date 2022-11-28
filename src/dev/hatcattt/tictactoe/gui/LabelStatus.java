package dev.hatcattt.tictactoe.gui;

import java.awt.*;

enum Status {

    ACTIVE("The game is active"),
    NO_ACTIVE("The game is not lunch yet."),
    X_WIN("X win the game!"),
    O_WIN("O win the game!");

    private final String textStatus;

    Status(String textLabel) {
        this.textStatus = textLabel;
    }

    public String getTextStatus() {
        return textStatus;
    }
}

public class LabelStatus extends Label {
    private Status status;

    public LabelStatus(Status status) {
        this.status = status;
        super.setText(status.getTextStatus());
    }
}
