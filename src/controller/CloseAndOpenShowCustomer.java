package controller;

import javax.swing.JFrame;
import model.Shop;
import view.ShowCustomer;

public class CloseAndOpenShowCustomer extends CloseAndOpen {

    public CloseAndOpenShowCustomer(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new ShowCustomer(shop);
    }
}
