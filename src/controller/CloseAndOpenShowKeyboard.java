package controller;

import javax.swing.JFrame;
import model.Shop;
import view.ShowKeyboard;

public class CloseAndOpenShowKeyboard extends CloseAndOpen {

    public CloseAndOpenShowKeyboard(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new ShowKeyboard(shop);
    }
}
