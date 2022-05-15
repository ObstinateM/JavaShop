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
        setBounds(500, 500, 500, 600);

        setVisible(true);
        // label
        // JLabel welcome = new JLabel("Pointez votre status :");
        // welcome.setHorizontalAlignment(SwingConstants.CENTER);
        // welcome.setFont(new Font("Verdana", Font.PLAIN, 18));
        // p.add(welcome);
        // textField
        tfFirstName = new JTextField();
        tfFirstName.setBounds(100, 150, 300, 25);
        p.add(tfFirstName);
        tfFirstName.setColumns(10);

        // tfLastname = new JTextField();
        // tfLastname.setBounds(100, 180, 300, 25);
        // p.add(tfLastname);
        // tfLastname.setColumns(10);

        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(100, 210, 300, 25);
        p.add(jComboBox);

        // JButton btnSubmit = new JButton("Valider");
        // btnSubmit.addActionListener(new SetEmployeeStatusController(s, this,
        // jComboBox, tfFirstName));
        // btnSubmit.setLayout(null);
        // btnSubmit.setBounds(100, 250, 300, 25);
        // p.add(btnSubmit);

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

        // JButton btnNewEmployee = new JButton("Nouveau ? Cliquez ici");
        // btnNewEmployee.setBounds(100, 300, 150, 20);
        // btnNewEmployee.addActionListener(new CloseAndOpenNewEmployeeWindow(this, s));
        // p.add(btnNewEmployee);

    }

}