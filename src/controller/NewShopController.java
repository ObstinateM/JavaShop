package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Shop;
import view.LoginExist;
import java.awt.event.ActionEvent;

public class NewShopController implements ActionListener {
    private JFrame frame;
    private JTextField tfNameShop;
    private JPasswordField tfPassword;
    private JTextField tfAddress;
    private Shop shop;

    public NewShopController(JFrame f, JTextField tfNameShop, JPasswordField tfPassword,
            JTextField tfAddress) {
        this.frame = f;
        this.tfNameShop = tfNameShop;
        this.tfPassword = tfPassword;
        this.tfAddress = tfAddress;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tfNameShop.getText().isEmpty() || tfAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Champ vide",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            if (tfNameShop.getText().equals("") || tfAddress.getText().equals("")) {
                JFrame a = new JFrame();
                JOptionPane.showMessageDialog(a, "Nom incorrect", "Champ incorrect", 2);
            } else {
                this.shop = new Shop(tfNameShop.getText(), new String(tfPassword.getPassword()),
                        tfAddress.getText());
                frame.dispose();
                new LoginExist(shop);
            }
        }
    }
}
