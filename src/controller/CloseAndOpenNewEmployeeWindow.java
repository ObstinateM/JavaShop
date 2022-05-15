package controller;

import javax.swing.JFrame;
import model.Shop;
import view.NewEmployeWindow;

public class CloseAndOpenNewEmployeeWindow extends CloseAndOpen {

    public CloseAndOpenNewEmployeeWindow(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new NewEmployeWindow(shop);
    }
}
