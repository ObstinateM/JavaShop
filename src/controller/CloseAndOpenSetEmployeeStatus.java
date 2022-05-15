package controller;

import javax.swing.JFrame;
import model.Shop;
import view.SetStatusForEmployee;

public class CloseAndOpenSetEmployeeStatus extends CloseAndOpen {

    public CloseAndOpenSetEmployeeStatus(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new SetStatusForEmployee(shop);
    }
}
