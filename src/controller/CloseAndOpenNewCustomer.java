package controller;

import javax.swing.JFrame;
import model.Shop;
import view.NewCustomer;

public class CloseAndOpenNewCustomer extends CloseAndOpen {

    public CloseAndOpenNewCustomer(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new NewCustomer(shop);
    }
}
