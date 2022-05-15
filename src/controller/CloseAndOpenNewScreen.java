package controller;

import javax.swing.JFrame;
import model.Shop;
import view.NewScreen;

public class CloseAndOpenNewScreen extends CloseAndOpen {

    public CloseAndOpenNewScreen(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new NewScreen(shop);
    }
}
