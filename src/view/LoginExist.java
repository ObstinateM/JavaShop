package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;

public class LoginExist extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();
    private JTextField tfNameShop;
    private JPasswordField tfPassword;

    public LoginExist(Shop s) {
        setTitle("Connecter-vous a votre magasin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        setContentPane(p);
        setBounds(500, 500, 500, 400);
        setResizable(false);
        setVisible(true);
        // label
        JLabel labelWelcome1 = new JLabel(
                "Bienvenue dans votre gestionnaire de magasin ! ");
        labelWelcome1.setHorizontalAlignment(SwingConstants.CENTER);
        labelWelcome1.setFont(new Font("Verdana", Font.PLAIN, 18));

        labelWelcome1.setBounds(0, 12, 500, 25);
        p.add(labelWelcome1);

        JLabel labelNameShop = new JLabel("Nom du magasin :");
        labelNameShop.setHorizontalAlignment(SwingConstants.CENTER);
        labelNameShop.setBounds(100, 82, 300, 25);
        p.add(labelNameShop);
        JLabel labelPassword = new JLabel("Mot de passe :");
        labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelPassword.setBounds(100, 150, 300, 25);
        p.add(labelPassword);

        // textfield
        tfNameShop = new JTextField();
        tfNameShop.setBounds(100, 107, 300, 25);
        tfNameShop.setColumns(10);
        p.add(tfNameShop);

        tfPassword = new JPasswordField();
        tfPassword.setBounds(100, 177, 300, 25);
        tfPassword.setColumns(10);
        p.add(tfPassword);

        // button
        JButton btnLogin = new JButton("Se connecter");
        btnLogin.setBounds(100, 250, 300, 25);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tfNameShop.getText().equals(s.getName())
                        && tfPassword.getText().equals(s.getPassword())) {
                    dispose();
                    new MainInterface(s);

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Votre nom de magasin ou votre mot de passe est incorrect",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        JButton btnReset = new JButton("Réinitialiser le mot de passe");
        btnReset.setBounds(100, 300, 300, 25);
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ResetPassword(s);
            }
        });
        p.add(btnReset);
        p.add(btnLogin);

    }
}