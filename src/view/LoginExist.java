package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import controller.LoginController;
import controller.OpenResetPassword;
import model.Shop;

public class LoginExist extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();
    private JTextField tfNameShop;
    private JPasswordField tfPassword;

    public LoginExist(Shop s) {
        setTitle("Connecter-vous à votre magasin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        setContentPane(p);
        setBounds(100, 100, 500, 400);
        setResizable(false);
        setVisible(true);

        JLabel labelWelcome1 = new JLabel("Bienvenue dans votre gestionnaire de magasin !");
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

        tfNameShop = new JTextField();
        tfNameShop.setBounds(100, 107, 300, 25);
        tfNameShop.setColumns(10);
        p.add(tfNameShop);

        tfPassword = new JPasswordField();
        tfPassword.setBounds(100, 177, 300, 25);
        tfPassword.setColumns(10);
        p.add(tfPassword);

        JButton btnLogin = new JButton("Se connecter");
        btnLogin.setBounds(100, 250, 300, 25);
        btnLogin.addActionListener(new LoginController(this, s, tfNameShop, tfPassword));
        p.add(btnLogin);

        JButton btnReset = new JButton("Réinitialiser le mot de passe");
        btnReset.setBounds(100, 300, 300, 25);
        btnReset.addActionListener(new OpenResetPassword(s));
        p.add(btnReset);
    }
}
