package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;

public abstract class CloseAndOpenNoShop implements ActionListener {
    private JFrame frame;

    public CloseAndOpenNoShop(JFrame f) {
        this.frame = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        open();
    }

    public abstract void open();
}
