package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.ShowArticle;
import java.awt.event.ActionEvent;

public class CloseAndOpenShowArticle implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenShowArticle(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new ShowArticle(this.s);
    }
}
