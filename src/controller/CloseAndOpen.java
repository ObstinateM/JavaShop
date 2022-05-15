package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import java.awt.event.ActionEvent;

public abstract class CloseAndOpen implements ActionListener {
    private JFrame frame;
    private Shop shop;

    public CloseAndOpen(JFrame f, Shop s) {
        this.frame = f;
        this.shop = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        open(shop);
    }

    public abstract void open(Shop shop);
}
