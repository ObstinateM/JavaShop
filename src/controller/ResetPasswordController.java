package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Shop;
import java.awt.event.ActionEvent;

public class ResetPasswordController implements ActionListener {
    private JFrame frame;
    private Shop s;
    private JTextField tfPassword;

    public ResetPasswordController(JFrame f, Shop s, JTextField tfPassword) {
        this.frame = f;
        this.s = s;
        this.tfPassword = tfPassword;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        s.setPassword(tfPassword.getText());
        JFrame a = new JFrame();
        JOptionPane.showMessageDialog(a, "Mot de passe changez avec succès", "Mot de passe modifié",
                2);
        frame.dispose();
    }
}
