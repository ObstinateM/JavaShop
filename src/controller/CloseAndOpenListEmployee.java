package controller;

import javax.swing.JFrame;
import model.Shop;
import view.ListEmployeeWindow;

public class CloseAndOpenListEmployee extends CloseAndOpen {

    public CloseAndOpenListEmployee(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new ListEmployeeWindow(shop);
    }
}
