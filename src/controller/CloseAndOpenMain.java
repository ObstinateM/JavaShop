package controller;

import javax.swing.JFrame;
import model.Shop;
import view.MainInterface;

public class CloseAndOpenMain extends CloseAndOpen {

    public CloseAndOpenMain(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new MainInterface(shop);
    }
}
