package controller;

import java.time.*;
import java.util.*;
import javax.swing.*;
import model.*;

public class NewShop {
    Shop shop;

    public NewShop(JTextField tfShopName, JPasswordField tfPassword, JTextField tfAddress) {

        if (tfShopName.getText().equals("") || tfAddress.getText().equals("")) {
            JFrame a = new JFrame();
            JOptionPane.showMessageDialog(a, "Nom incorrect", "Empty Field", 2);
        } else {

            shop = new Shop(tfShopName.getText(), new String(tfPassword.getPassword()), tfAddress.getText());
            if (!tfAddress.getText().isEmpty()) {
                shop.setAddress(tfAddress.getText());
            }
        }
    }

    public Shop getShop() {
        return shop;
    }

}
