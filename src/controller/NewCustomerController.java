package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Customer;
import model.Shop;
import view.MainInterface;
import java.awt.event.ActionEvent;
import utils.Date;

public class NewCustomerController implements ActionListener {

    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JTextField dob;
    private JComboBox<String> jComboBox;
    private JFrame frame;
    private Shop shop;

    public NewCustomerController(JFrame frame, Shop s, JTextField tfFirstName,
            JTextField tfLastName, JTextField dob, JComboBox<String> jComboBox) {
        this.tfFirstName = tfFirstName;
        this.tfLastName = tfLastName;
        this.dob = dob;
        this.jComboBox = jComboBox;
        this.frame = frame;
        this.shop = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tfFirstName.getText().isEmpty() || tfLastName.getText().isEmpty()
                || dob.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
        } else if (!Date.validateDate(dob.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer une date valide");
        } else {
            int sexNumber = jComboBox.getSelectedIndex() + 1;
            String sexString = sexNumber == 1 ? "HOMME" : "FEMME";
            int min = 100;
            int max = 999;
            int id = (int) Math.floor(Math.random() * (max - min + 1) + min);

            Customer customer = new Customer(tfFirstName.getText(), tfLastName.getText(),
                    dob.getText(), sexString, id);
            shop.getCustomerList().add(customer);
            JOptionPane.showMessageDialog(null, "Client ajouté");
            frame.dispose();
            new MainInterface(shop);
        }
    }
}
