package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.NewArticle;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewArticle implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenNewArticle(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewArticle(this.s);
    }
}
