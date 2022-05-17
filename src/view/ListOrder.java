package view;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import controller.CloseAndOpenMain;
import model.Shop;

public class ListOrder extends JFrame {
    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();

    public ListOrder(Shop s) {
        setTitle("Vos employes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        setContentPane(p);
        setBounds(100, 100, 700, 400);

        setResizable(false);
        setVisible(true);

        JLabel labelWelcome1 = new JLabel("Voici la liste de toutes les commandes : ");
        labelWelcome1.setFont(new Font("Verdana", Font.PLAIN, 18));
        labelWelcome1.setBounds(0, 12, 500, 25);
        p.add(labelWelcome1);

        JTextPane textAreaEmployee = new JTextPane();
        textAreaEmployee.setEditable(false);
        textAreaEmployee.setText(s.getOrderListAsString());
        textAreaEmployee.setBounds(0, 50, 700, 200);
        p.add(textAreaEmployee);

        JButton btnBack = new JButton("Retour");
        btnBack.setBounds(10, 300, 100, 30);
        btnBack.setBackground(Color.decode("#C70039"));
        btnBack.addActionListener(new CloseAndOpenMain(this, s));
        p.add(btnBack);
    }
}
