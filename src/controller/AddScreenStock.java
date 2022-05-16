package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Screen;
import model.Shop;
import utils.Regex;
import java.awt.event.ActionEvent;

public class AddScreenStock implements ActionListener {
    private Screen screen;
    private Shop shop;
    private JTextField number;
    private JComboBox<String> cbName;

    public AddScreenStock(Shop shop, JTextField number, JComboBox<String> cbName) {
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

        this.screen = this.shop.getScreenByName(cbName.getSelectedItem().toString());
        screen.setInventory(screen.getInventory() + Integer.parseInt(number.getText()));
    }
}
