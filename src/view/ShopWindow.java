package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
}
