package view;

import javax.swing.*;
import controller.*;
import model.*;

public class NewEmployeWindow extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JTextField dob;

    String[] optionsToChoose = {"Homme", "Femme"};

    public NewEmployeWindow(Shop s) {
        setTitle("Ajouter un employé");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        setContentPane(p);
        setBounds(500, 500, 500, 600);

        setVisible(true);
        // label
        JLabel labelFirstName = new JLabel("Prénom :");
        labelFirstName.setHorizontalAlignment(SwingConstants.CENTER);
        labelFirstName.setBounds(100, 82, 300, 25);
        p.add(labelFirstName);
        JLabel labelLastName = new JLabel("Nom :");
        labelLastName.setHorizontalAlignment(SwingConstants.CENTER);
        labelLastName.setBounds(100, 150, 300, 25);
        p.add(labelLastName);
        JLabel labelDob = new JLabel("Date de naissance :");
        labelDob.setHorizontalAlignment(SwingConstants.CENTER);
        labelDob.setBounds(100, 220, 300, 25);
        p.add(labelDob);
        JLabel labelSex = new JLabel("Sexe :");
        labelSex.setHorizontalAlignment(SwingConstants.CENTER);
        labelSex.setBounds(100, 270, 300, 25);
        p.add(labelSex);
        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(100, 290, 300, 25);
        p.add(jComboBox);
        // textfield
        tfFirstName = new JTextField();
        tfFirstName.setBounds(100, 100, 300, 25);
        p.add(tfFirstName);
        tfLastName = new JTextField();
        tfLastName.setBounds(100, 170, 300, 25);
        p.add(tfLastName);
        dob = new JTextField();
        dob.setBounds(100, 240, 300, 25);
        p.add(dob);
        // button
        JButton btnNewEmploye = new JButton("Valider");
        btnNewEmploye.setBounds(100, 400, 300, 25);
        btnNewEmploye.addActionListener(
                new NewEmployeeController(this, s, tfFirstName, tfLastName, dob, jComboBox));
        p.add(btnNewEmploye);

    }
}
