package view;

import java.awt.*;
import javax.swing.*;
import controller.CloseAndOpenNewShopWindow;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();
    private JTextField tfNameShop;
    private JPasswordField tfPassword;

    public Login() {
        setTitle("Connecter-vous a votre magasin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        setContentPane(p);
        setBounds(500, 500, 500, 400);
        setResizable(false);
        setVisible(true);
        // label
        JLabel labelWelcome1 = new JLabel("Bienvenue dans votre gestionnaire de magasin ! ");
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
        btnLogin.addActionListener(new CloseAndOpenNewShopWindow(this));
        p.add(btnLogin);

        JButton btnewShop = new JButton("Pas de magasin ? Créez-en un !");
        btnewShop.setBounds(100, 400, 300, 25);
        btnewShop.addActionListener(new CloseAndOpenNewShopWindow(this));
        p.add(btnewShop);
    }
}
