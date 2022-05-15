package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.NewKeyboard;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewKeyboard implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenNewKeyboard(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewKeyboard(this.s);
    }
}
