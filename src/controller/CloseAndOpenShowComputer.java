package controller;

import javax.swing.JFrame;
import model.Shop;
import view.ShowComputer;

public class CloseAndOpenShowComputer extends CloseAndOpen {

    public CloseAndOpenShowComputer(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new ShowComputer(shop);
    }
}
