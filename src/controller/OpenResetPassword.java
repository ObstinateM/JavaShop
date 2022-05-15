package controller;

import java.awt.event.ActionListener;
import model.Shop;
import view.ResetPassword;
import java.awt.event.ActionEvent;

public class OpenResetPassword implements ActionListener {
    private Shop shop;

    public OpenResetPassword(Shop s) {
        this.shop = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ResetPassword(shop);
    }
}
