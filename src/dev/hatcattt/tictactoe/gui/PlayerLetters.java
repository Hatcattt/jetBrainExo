package dev.hatcattt.tictactoe.gui;

/**
 * Represent the letter that the players play on the main board.
 */
public class PlayerLetters {
    private static final String[] LETTERS = new String[] {"X", "O"};
    private static int index = 1;

    /**
     * "Swap" the index. If 1 then 0. If 0 than 1.
     */
    private static void changeLetterIndex() {
        if (index == 1) {
            index = 0;
        } else if (index == 0) {
            index = 1;
        }
    }

    /**
     * Get a letter that alternates between the X and the O statically.
     * @return a letter (X than 0 after the second call)
     */
    public static String getLetter() {
        changeLetterIndex();
        return LETTERS[index];
    }
}