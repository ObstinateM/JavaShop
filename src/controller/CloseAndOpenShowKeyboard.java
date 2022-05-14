package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.ShowKeyboard;
import java.awt.event.ActionEvent;

public class CloseAndOpenShowKeyboard implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenShowKeyboard(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new ShowKeyboard(this.s);
    }
}
