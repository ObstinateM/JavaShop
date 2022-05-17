package controller;

import javax.swing.JFrame;
import model.Shop;
import view.ListOrder;

public class CloseAndOpenListOrder extends CloseAndOpen {

    public CloseAndOpenListOrder(JFrame f, Shop s) {
        super(f, s);
    }

    public void open(Shop shop) {
        new ListOrder(shop);
    }
}
