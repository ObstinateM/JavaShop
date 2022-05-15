package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.ShowScreen;
import java.awt.event.ActionEvent;

public class CloseAndOpenShowScreen implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenShowScreen(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new ShowScreen(this.s);
    }
}
