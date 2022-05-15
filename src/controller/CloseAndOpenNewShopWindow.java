package controller;

import javax.swing.JFrame;
import view.NewShopWindow;

public class CloseAndOpenNewShopWindow extends CloseAndOpenNoShop {

    public CloseAndOpenNewShopWindow(JFrame f) {
        super(f);
    }

    @Override
    public void open() {
        new NewShopWindow();
    }
}
