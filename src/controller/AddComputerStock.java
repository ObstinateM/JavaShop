package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Computer;
import model.Shop;
import utils.Regex;
import java.awt.event.ActionEvent;

public class AddComputerStock implements ActionListener {
    private Computer computer;
    private Shop shop;
    private JTextField number;
    private JComboBox<String> cbName;

    public AddComputerStock(Shop shop, JTextField number, JComboBox<String> cbName) {
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

        this.computer = this.shop.getComputerByName(cbName.getSelectedItem().toString());
        computer.setInventory(computer.getInventory() + Integer.parseInt(number.getText()));
    }
}
