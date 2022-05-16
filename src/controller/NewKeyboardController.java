package controller;

import model.Keyboard;
import model.Shop;
import view.MainInterface;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import utils.Regex;

public class NewKeyboardController implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JTextField tfName;
    private JTextField tfPrice;
    private JTextField tfInventory;
    private JCheckBox tfIsMechanical;
    private JCheckBox tfIsRGB;
    private JCheckBox tfIsWireless;
    private JCheckBox tfHasKeypad;

    public NewKeyboardController(Shop s, JFrame f, JTextField tfName, JTextField tfPrice,
            JTextField tfInventory, JCheckBox tfIsMechanical, JCheckBox tfIsRGB,
            JCheckBox tfIsWireless, JCheckBox tfHasKeypad) {
        this.shop = s;
        this.frame = f;
        this.tfName = tfName;
        this.tfPrice = tfPrice;
        this.tfInventory = tfInventory;
        this.tfIsMechanical = tfIsMechanical;
        this.tfIsRGB = tfIsRGB;
        this.tfIsWireless = tfIsWireless;
        this.tfHasKeypad = tfHasKeypad;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tfName.getText().isEmpty() || tfPrice.getText().isEmpty()
                || tfInventory.getText().isEmpty()) {
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

        if (!Regex.validateNumber(tfInventory.getText())) {
            JOptionPane.showMessageDialog(null,
                    "Veuillez entrer un nombre valide dans l'inventaire", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int min = 100;
        int max = 999;
        int id = (int) Math.floor(Math.random() * (max - min + 1) + min);
        shop.getKeyboardList()
                .add(new Keyboard(id, tfName.getText(), Double.parseDouble(tfPrice.getText()),
                        Integer.parseInt(tfInventory.getText()), 0, tfIsMechanical.isSelected(),
                        tfIsRGB.isSelected(), tfIsWireless.isSelected(), tfHasKeypad.isSelected()));
        JOptionPane.showMessageDialog(null, "Clavier ajouté");
        frame.dispose();
        new MainInterface(shop);
    }
}
