package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import controller.NewShopController;

public class NewShopWindow extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();
    private JTextField tfNameShop;
    private JPasswordField tfPassword;
    private JTextField tfAddress;

    public NewShopWindow() {
        setTitle("Création d'un nouveau magasin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setBackground(Color.LIGHT_GRAY);
        p.setLayout(null);
        setContentPane(p);
        setBounds(500, 500, 500, 400);
        setResizable(false);
        setVisible(true);

        JLabel labelWelcome1 = new JLabel("Pour commencer veuillez remplir les champs suivants : ");
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

        JLabel labelAddress = new JLabel("Adresse :");
        labelAddress.setHorizontalAlignment(SwingConstants.CENTER);
        labelAddress.setBounds(100, 200, 300, 25);
        p.add(labelAddress);

        tfNameShop = new JTextField();
        tfNameShop.setBounds(100, 107, 300, 25);
        tfNameShop.setColumns(10);
        p.add(tfNameShop);

        tfPassword = new JPasswordField();
        tfPassword.setBounds(100, 177, 300, 25);
        tfPassword.setColumns(10);
        p.add(tfPassword);

        tfAddress = new JTextField();
        tfAddress.setBounds(100, 237, 300, 25);
        tfAddress.setColumns(10);
        p.add(tfAddress);

        JButton btnValider = new JButton("Valider");
        btnValider.setBounds(199, 280, 100, 25);
        p.add(btnValider);

        btnValider
                .addActionListener(new NewShopController(this, tfNameShop, tfPassword, tfAddress));
    }
}
