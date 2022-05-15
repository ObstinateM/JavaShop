package controller;

import javax.swing.JFrame;
import model.Shop;
import view.NewComputer;

public class CloseAndOpenNewComputer extends CloseAndOpen {

    public CloseAndOpenNewComputer(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new NewComputer(shop);
    }
}
