package dev.hatcattt.jtbrn.swing.layoutmanager;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActiveTimeCounterWindowAdapter extends WindowAdapter {
    private long activationCounter = 0; // do not change it

    @Override
    public void windowActivated(WindowEvent e) {
        activationCounter++;
    }
}
