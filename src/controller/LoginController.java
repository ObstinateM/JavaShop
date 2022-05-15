package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Shop;
import view.MainInterface;
import java.awt.event.ActionEvent;

public class LoginController implements ActionListener {
    private JFrame frame;
    private Shop shop;
    private JTextField tfNameShop;
    private JPasswordField tfPassword;

    public LoginController(JFrame f, Shop s, JTextField tfNameShop, JPasswordField tfPassword) {
        this.frame = f;
        this.shop = s;
        this.tfNameShop = tfNameShop;
        this.tfPassword = tfPassword;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tfNameShop.getText().equals(shop.getName())
                && shop.getPassword().equals(new String(tfPassword.getPassword()))) {
            frame.dispose();
            new MainInterface(shop);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Votre nom de magasin ou votre mot de passe est incorrect", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
