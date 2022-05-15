package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.NewScreen;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewScreen implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenNewScreen(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewScreen(this.s);
    }
}
