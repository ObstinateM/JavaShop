package controller;

import javax.swing.JFrame;
import model.Shop;
import view.NewKeyboard;

public class CloseAndOpenNewKeyboard extends CloseAndOpen {

    public CloseAndOpenNewKeyboard(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new NewKeyboard(shop);
    }
}
