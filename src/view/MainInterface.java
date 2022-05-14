package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit.BoldAction;
import model.*;
import controller.*;
import view.*;

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
        setResizable(false);
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
        employeePane.setBounds(531, 53, 183, 403);
        p.add(employeePane);
        employeePane.setLayout(null);
        btnEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new NewEmployeWindow(s);
            }
        });

        JLabel titleEmployee = new JLabel("Employ\u00E9s");
        titleEmployee.setFont(new Font("Tahoma", Font.PLAIN, 13));
        employeePane.add(titleEmployee);

        tableEmployee = new JTable();
        tableEmployee.setBorder(UIManager.getBorder("Tree.editorBorder"));
        tableEmployee.setModel(new DefaultTableModel(
                new Object[][] {{"1", "Working"}, {"2", "Pause"}, {"3", "Finished"},},
                new String[] {"Status", "Id"}));
        employeePane.add(tableEmployee);

        // MIDDLE
        JPanel middlePane = new JPanel();
        middlePane.setBounds(174, 53, 358, 403);
        p.add(middlePane);
        middlePane.setLayout(null);

        JLabel titleRestock = new JLabel("Articles que nous vendons");
        titleRestock.setFont(new Font("Tahoma", Font.PLAIN, 13));
        titleRestock.setBounds(93, 11, 173, 14);
        middlePane.add(titleRestock);

        JTextPane textAreaRestock = new JTextPane();
        textAreaRestock.setEditable(false);
        textAreaRestock.setText(s.getAllArticlesAsString());

        JScrollPane scrollPane = new JScrollPane(textAreaRestock);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(10, 36, 338, 250);
        middlePane.add(scrollPane);

        JButton btnNewArticle = new JButton("Ajouter un article");
        btnNewArticle.setBounds(50, 300, 250, 29);
        btnNewArticle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new NewArticle(s);
            }
        });
        middlePane.add(btnNewArticle);

        JLabel labelProfit = new JLabel("Total profit: 5000$");
        labelProfit.setBounds(10, 114, 338, 14);
        middlePane.add(labelProfit);

        JLabel labelBestSeller = new JLabel("Article le plus vendu : PS5");
        labelBestSeller.setBounds(10, 135, 338, 14);
        middlePane.add(labelBestSeller);
    }
}
