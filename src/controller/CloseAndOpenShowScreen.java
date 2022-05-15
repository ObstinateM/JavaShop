package controller;

import javax.swing.JFrame;
import model.Shop;
import view.ShowScreen;

public class CloseAndOpenShowScreen extends CloseAndOpen {

    public CloseAndOpenShowScreen(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new ShowScreen(shop);
    }
}
