package controller;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.Shop;
import view.MainInterface;

public class CloseAndOpenMainInterface implements ActionListener {
    Shop shop;
    JFrame frame;

    public CloseAndOpenMainInterface(Shop s, JFrame f) {
        this.shop = s;
        this.frame = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new MainInterface(shop);
    }
}
