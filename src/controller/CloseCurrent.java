package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;

public class CloseCurrent implements ActionListener {
    private JFrame frame;

    public CloseCurrent(JFrame f) {
        this.frame = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
    }
}
