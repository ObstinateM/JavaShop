package view;

import java.awt.*;
import javax.swing.*;

public class ShopWindow extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();

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

    public Object getPassword() {
        return null;
    }
}
