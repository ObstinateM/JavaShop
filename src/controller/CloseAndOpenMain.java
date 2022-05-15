package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.MainInterface;
import java.awt.event.ActionEvent;

public class CloseAndOpenMain implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenMain(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new MainInterface(this.s);
    }
}
