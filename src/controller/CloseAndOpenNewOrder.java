package controller;

import javax.swing.JFrame;
import model.Shop;
import view.NewOrder;

public class CloseAndOpenNewOrder extends CloseAndOpen {

    public CloseAndOpenNewOrder(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new NewOrder(shop);
    }
}
