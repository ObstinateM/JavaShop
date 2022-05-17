package controller;

import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Keyboard;
import model.Shop;
import utils.Regex;
import view.MainInterface;
import java.awt.event.ActionEvent;

public class EditKeyboardController implements ActionListener {
    private Keyboard keyboard;
    private Shop shop;
    private JFrame frame;
    private JTextField tfName;
    private JTextField tfPrice;
    private JCheckBox cbMechanical;
    private JCheckBox cbRGB;
    private JCheckBox cbWireless;
    private JCheckBox cbKeypad;

    public EditKeyboardController(JFrame frame, Shop shop, JComboBox<String> comboBox,
            JTextField tfName, JTextField tfPrice, JCheckBox cbMechanical, JCheckBox cbRGB,
            JCheckBox cbWireless, JCheckBox cbKeypad) {
        this.keyboard = shop.getKeyboardByName(comboBox.getSelectedItem().toString());
        this.frame = frame;
        this.shop = shop;
        this.tfName = tfName;
        this.tfPrice = tfPrice;
        this.cbMechanical = cbMechanical;
        this.cbRGB = cbRGB;
        this.cbWireless = cbWireless;
        this.cbKeypad = cbKeypad;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tfName.getText().isEmpty() || tfPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateLettersAndNumbers(tfName.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un nom valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfPrice.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un prix valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            keyboard.setName(tfName.getText());
            keyboard.setPrice(Double.parseDouble(tfPrice.getText()));
            keyboard.setMechanical(cbMechanical.isSelected());
            keyboard.setRGB(cbRGB.isSelected());
            keyboard.setWireless(cbWireless.isSelected());
            keyboard.setKeypad(cbKeypad.isSelected());
        } catch (Exception err) {
            System.out.println(err.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur de type");
        }
        frame.dispose();
        new MainInterface(shop);
    }
}
