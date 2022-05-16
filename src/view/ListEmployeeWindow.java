package view;

import java.awt.*;
import javax.swing.*;

import controller.*;
import model.Shop;

public class ListEmployeeWindow extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();

    public ListEmployeeWindow(Shop s) {
        setTitle("Vos employes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        setContentPane(p);
        setBounds(100, 100, 700, 400);

        setResizable(false);
        setVisible(true);
        // label
        JLabel labelWelcome1 = new JLabel("Voici la liste de tout vos employes : ");
        labelWelcome1.setFont(new Font("Verdana", Font.PLAIN, 18));
        labelWelcome1.setBounds(0, 12, 500, 25);
        p.add(labelWelcome1);

        JTextPane textAreaEmployee = new JTextPane();
        textAreaEmployee.setEditable(false);
        textAreaEmployee.setText(s.getAllEmployeeAsString());
        textAreaEmployee.setBounds(0, 50, 700, 200);
        p.add(textAreaEmployee);

        // button retour
        JButton btnBack = new JButton("Retour");
        btnBack.setBounds(10, 300, 100, 30);
        btnBack.setBackground(Color.decode("#C70039"));
        btnBack.addActionListener(new CloseAndOpenMain(this, s));
        p.add(btnBack);
    }
}
