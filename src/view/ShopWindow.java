package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.*;

public class ShopWindow extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();
    private JTextField tfNameShop;
    private JPasswordField tfPassword;
    private JTextField tfAddress;

    public ShopWindow(ShopWindow shop) {
        setTitle("Bienvenue au magasin :" + shop.getName());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setBackground(Color.LIGHT_GRAY);
        p.setLayout(null);
        setContentPane(p);
        setBounds(500, 500, 800, 400);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewShopWindow frame = new NewShopWindow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Object getPassword() {
        return null;
    }
}
