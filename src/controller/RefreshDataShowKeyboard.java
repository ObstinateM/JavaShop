package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import model.Keyboard;
import model.Shop;
import java.awt.event.ActionEvent;

public class RefreshDataShowKeyboard implements ActionListener {
    private Shop shop;
    private Keyboard keyboard;
    private JComboBox<String> cbName;
    private JLabel lblNumberSell;
    private JLabel lblInventory;
    private JLabel lblPrice;
    private JLabel lblMechanical;
    private JLabel lblRGB;
    private JLabel lblKeypad;
    private JLabel lblWireless;

    public RefreshDataShowKeyboard(Shop shop, Keyboard keyboard, JLabel lblNumberSell,
            JLabel lblInventory, JLabel lblPrice, JLabel lblMechanical, JLabel lblRGB,
            JLabel lblKeypad, JLabel lblWireless, JComboBox<String> cbName) {
        this.shop = shop;
        this.keyboard = keyboard;
        this.lblNumberSell = lblNumberSell;
        this.lblInventory = lblInventory;
        this.lblPrice = lblPrice;
        this.lblMechanical = lblMechanical;
        this.lblRGB = lblRGB;
        this.lblKeypad = lblKeypad;
        this.lblWireless = lblWireless;
        this.cbName = cbName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        keyboard = shop.getKeyboardByName(cbName.getSelectedItem().toString());
        lblNumberSell.setText(keyboard.getNumberOfSell() + " vendus");
        lblInventory.setText(keyboard.getInventory() + " en stocks");
        lblPrice.setText("Prix : " + keyboard.getPrice() + "€");
        lblMechanical.setText(keyboard.isMechanical() ? "Le clavier est mechanique"
                : "Le clavier n'est pas mechanique");
        lblRGB.setText(keyboard.isRGB() ? "Le clavier est RGB" : "Le clavier n'est pas RGB");
        lblKeypad.setText(
                keyboard.hasKeypad() ? "Le clavier a un keypad" : "Le clavier n'a pas de keypad");
        lblWireless.setText(keyboard.isWireless() ? "Le clavier est sans fil"
                : "Le clavier n'est pas sans fil");
    }
}
