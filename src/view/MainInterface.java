package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import model.*;
import controller.*;

public class MainInterface extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel p = new JPanel();
    JTable tableEmployee = new JTable();

    public MainInterface(Shop s) {
        setTitle("Gestion du magasin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 400, 900, 500);
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(null);
        setContentPane(p);
        Border lineborder = BorderFactory.createLineBorder(Color.black, 1);
        setVisible(true);
        // HEADER //
        // HEADER //
        // HEADER //
        JPanel header = new JPanel();
        header.setBounds(0, 0, 700, 50);
        header.setBackground(Color.decode("#696969"));
        header.setLayout(null);
        p.add(header);
        header.setBorder(lineborder);
        JLabel labelShop = new JLabel("Nom du magasin : " + s.getName());

        labelShop.setFont(new Font("Verdana", Font.PLAIN, 20));
        labelShop.setBounds(10, 0, 300, 50);
        header.add(labelShop);
        JLabel labelAddress = new JLabel("Adresse : " + s.getAddress());

        labelAddress.setFont(new Font("Verdana", Font.PLAIN, 15));
        labelAddress.setBounds(10, 15, 300, 50);
        header.add(labelAddress);
        // RIGHT SIDE //
        // RIGHT SIDE //
        // RIGHT SIDE //
        JPanel rightSide = new JPanel();
        rightSide.setBounds(700, 0, 200, 500);
        rightSide.setBackground(Color.decode("#696969"));
        rightSide.setLayout(null);
        p.add(rightSide);

        JButton btnEmployee = new JButton("Ajouter un Employé");
        btnEmployee.setBounds(20, 50, 150, 20);
        btnEmployee.addActionListener(new CloseAndOpenNewEmployeeWindow(this, s));
        btnEmployee.setHorizontalAlignment(SwingConstants.CENTER);
        rightSide.add(btnEmployee);

        JButton btnNewArticle = new JButton("Ajouter un article");
        btnNewArticle.setBounds(20, 90, 150, 20);
        btnNewArticle.addActionListener(new CloseAndOpenNewArticle(this, s));
        btnEmployee.setHorizontalAlignment(SwingConstants.CENTER);
        rightSide.add(btnNewArticle);

        JButton btnShowArticles = new JButton("Lister les articles");
        btnShowArticles.setBounds(20, 210, 150, 20);
        btnShowArticles.addActionListener(new CloseAndOpenShowArticle(this, s));
        btnShowArticles.setHorizontalAlignment(SwingConstants.CENTER);
        rightSide.add(btnShowArticles);

        // button for define the status of an employee
        JButton btnSetStatus = new JButton("Pointage d'employé");
        btnSetStatus.setBounds(20, 130, 150, 20);
        btnSetStatus.addActionListener(new CloseAndOpenSetEmployeeStatus(this, s));
        btnEmployee.setHorizontalAlignment(SwingConstants.CENTER);
        rightSide.add(btnSetStatus);
        // display list employ with data
        JButton btnListEmployee = new JButton("Liste des employés");
        btnListEmployee.setBounds(20, 170, 150, 20);
        btnListEmployee.addActionListener(new CloseAndOpenListEmployee(this, s));
        btnEmployee.setHorizontalAlignment(SwingConstants.CENTER);
        rightSide.add(btnListEmployee);

        // MIDLE //
        // MIDLE //
        // MIDLE //
        JPanel middle = new JPanel();
        middle.setBounds(0, 50, 700, 450);
        middle.setLayout(null);
        p.add(middle);
        middle.setBorder(lineborder);

        JLabel titleRestock = new JLabel("Articles que nous vendons");
        titleRestock.setFont(new Font("Tahoma", Font.PLAIN, 18));
        titleRestock.setBounds(259, 10, 300, 20);
        middle.add(titleRestock);

        JTextPane textAreaRestock = new JTextPane();
        textAreaRestock.setEditable(false);
        textAreaRestock.setText(s.getAllArticlesAsString());
        middle.add(textAreaRestock);
        JScrollPane scrollPane = new JScrollPane(textAreaRestock);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(259, 50, 400, 300);
        scrollPane.setBorder(lineborder);
        middle.add(scrollPane);

        JLabel statusEmploye = new JLabel("Status de vos employés");
        statusEmploye.setFont(new Font("Tahoma", Font.PLAIN, 18));
        statusEmploye.setBounds(15, 10, 300, 20);
        middle.add(statusEmploye);
        JTextPane textAreaStatusEmploye = new JTextPane();
        textAreaStatusEmploye.setEditable(false);
        textAreaStatusEmploye.setText(s.getAllEmployeeStatus());
        middle.add(textAreaStatusEmploye);
        JScrollPane scrollPaneStatus = new JScrollPane(textAreaStatusEmploye);
        scrollPaneStatus
                .setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPaneStatus.setBounds(15, 50, 200, 300);
        scrollPaneStatus.setBorder(lineborder);
        middle.add(scrollPaneStatus);

    }
}
