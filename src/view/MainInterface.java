package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import model.*;

public class MainInterface extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel p = new JPanel();
    JTable tableEmployee = new JTable();

    public MainInterface(Shop s) {
        setTitle("Gestion du magasin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 500, 740, 500);
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(null);
        setContentPane(p);

        setVisible(true);
        JPanel headerPane = new JPanel();
        headerPane.setBounds(5, 5, 709, 49);
        p.add(headerPane);
        headerPane.setLayout(new GridLayout(0, 3, 0, 0));

        JLabel labelShop = new JLabel("Nom du magasin : " + s.getName());
        labelShop.setForeground(Color.RED);
        labelShop.setFont(new Font("Verdana", Font.PLAIN, 15));
        headerPane.add(labelShop);
        JLabel labelAdress = new JLabel("Adresse : " + s.getAddress());
        labelAdress.setFont(new Font("Verdana", Font.PLAIN, 15));
        headerPane.add(labelAdress);

        JPanel orderPane = new JPanel();
        orderPane.setBounds(5, 53, 170, 403);
        p.add(orderPane);
        orderPane.setLayout(null);

        JLabel titleOrder = new JLabel("Commandes");
        titleOrder.setFont(new Font("Tahoma", Font.PLAIN, 13));
        titleOrder.setBounds(45, 11, 71, 14);
        orderPane.add(titleOrder);
        // employee
        JButton btnEmployee = new JButton("Ajouter un Employé");
        btnEmployee.setBounds(10, 36, 150, 23);
        orderPane.add(btnEmployee);

        JPanel employeePane = new JPanel();
        employeePane.setBounds(0, 400, 600, 200);
        p.add(employeePane);
        employeePane.setLayout(null);
        btnEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new NewEmployeWindow(s);
            }
        });
        JLabel listEmployee = new JLabel("Liste des employés");
        listEmployee.setFont(new Font("Tahoma", Font.PLAIN, 13));
        listEmployee.setBounds(0, 0, 150, 14);
        employeePane.add(listEmployee);

        JTextPane textAreaEmployee = new JTextPane();
        textAreaEmployee.setEditable(false);
        textAreaEmployee.setText(s.getAllEmployeeAsString());
        textAreaEmployee.setBounds(0, 0, 300, 200);
        employeePane.add(textAreaEmployee);
        // MIDDLE
        JPanel middlePane = new JPanel();
        middlePane.setBounds(174, 53, 358, 403);
        p.add(middlePane);
        middlePane.setLayout(null);

        JLabel titleRestock = new JLabel("Articles n\u00E9cessitant un restock");
        titleRestock.setFont(new Font("Tahoma", Font.PLAIN, 13));
        titleRestock.setBounds(93, 11, 173, 14);
        middlePane.add(titleRestock);

        JTextPane textAreaRestock = new JTextPane();
        textAreaRestock.setEditable(false);
        textAreaRestock.setText("- De l'eau\r\n- Du feu\r\n- wtv\r\n");
        textAreaRestock.setBounds(10, 36, 338, 52);
        middlePane.add(textAreaRestock);

        JLabel labelProfit = new JLabel("Total profit: 5000$");
        labelProfit.setBounds(10, 114, 338, 14);
        middlePane.add(labelProfit);

        JLabel labelBestSeller = new JLabel("Article le plus vendu : PS5");
        labelBestSeller.setBounds(10, 135, 338, 14);
        middlePane.add(labelBestSeller);
    }
}
