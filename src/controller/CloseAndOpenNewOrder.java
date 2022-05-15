package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.NewArticle;
import view.NewOrder;

import java.awt.event.ActionEvent;

public class CloseAndOpenNewOrder implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenNewOrder(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewOrder(this.s);
    }
}
