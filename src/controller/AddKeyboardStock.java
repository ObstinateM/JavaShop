package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Keyboard;
import model.Shop;
import utils.Regex;
import java.awt.event.ActionEvent;

public class AddKeyboardStock implements ActionListener {
    private Keyboard keyboard;
    private Shop shop;
    private JTextField number;
    private JComboBox<String> cbName;

    public AddKeyboardStock(Shop shop, JTextField number, JComboBox<String> cbName) {
        this.shop = shop;
        this.number = number;
        this.cbName = cbName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!Regex.validateNumber(number.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.keyboard = this.shop.getKeyboardByName(cbName.getSelectedItem().toString());
        keyboard.setInventory(keyboard.getInventory() + Integer.parseInt(number.getText()));
    }
}
