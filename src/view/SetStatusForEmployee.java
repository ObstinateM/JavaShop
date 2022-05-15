package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.*;
import model.Shop;

public class SetStatusForEmployee extends JFrame {

    private JTextField tfLastname;
    private JTextField tfFirstName;
    private JPanel p = new JPanel();
    String[] optionsToChoose = { "EN PAUSE", "TRAVAILLE..", "A FINIS", "VIRE !" };

    public SetStatusForEmployee(Shop s) {
        setTitle("Pointage d'employé");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        setContentPane(p);
        setBounds(500, 400, 500, 600);
        setVisible(true);
        // label
        JLabel welcome = new JLabel("Pointez votre status :");
        welcome.setFont(new Font("Verdana", Font.PLAIN, 18));
        welcome.setBounds(0, 10, 250, 25);
        welcome.setLayout(null);
        p.add(welcome);
        // label for first and last name
        JLabel labelFirstName = new JLabel("Prénom :");
        labelFirstName.setFont(new Font("Verdana", Font.PLAIN, 14));
        labelFirstName.setBounds(100, 120, 100, 25);
        labelFirstName.setLayout(null);
        p.add(labelFirstName);
        JTextField tfFirstName = new JTextField();
        tfFirstName.setBounds(100, 140, 300, 25);
        p.add(tfFirstName);
        tfFirstName.setColumns(10);
        JLabel labelLastName = new JLabel("Nom :");
        labelLastName.setFont(new Font("Verdana", Font.PLAIN, 14));
        labelLastName.setBounds(100, 160, 100, 25);
        labelLastName.setLayout(null);
        p.add(labelLastName);

        tfLastname = new JTextField();
        tfLastname.setBounds(100, 180, 300, 25);
        p.add(tfLastname);
        tfLastname.setColumns(10);

        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(100, 210, 300, 25);
        p.add(jComboBox);

        JButton btnSubmit = new JButton("Valider");
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SetEmployeeStatusController(s, jComboBox, tfFirstName);
                dispose();
            }

        });
        btnSubmit.setLayout(null);
        btnSubmit.setBounds(100, 250, 300, 25);
        p.add(btnSubmit);

        JButton btnNewEmployee = new JButton("Nouveau ? Cliquez ici");
        btnNewEmployee.setBounds(100, 300, 300, 20);
        btnNewEmployee.addActionListener(new CloseAndOpenNewEmployeeWindow(this, s));
        p.add(btnNewEmployee);

        JButton btnBack = new JButton("Retour");
        btnBack.setBounds(200, 350, 100, 30);
        btnBack.setBackground(Color.decode("#C70039"));
        btnBack.addActionListener(new CloseAndOpenMainInterface(s, this));
        p.add(btnBack);
    }

}