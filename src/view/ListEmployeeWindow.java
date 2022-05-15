package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit.BoldAction;

import controller.*;
import model.Shop;

public class ListEmployeeWindow extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();

    public ListEmployeeWindow(Shop s) {
        setTitle("Connecter-vous a votre magasin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        setContentPane(p);
        setBounds(500, 500, 700, 400);

        setVisible(true);
        // label
        JLabel labelWelcome1 = new JLabel(
                "Voici la liste de tout vos employees : ");
        labelWelcome1.setHorizontalAlignment(SwingConstants.CENTER);
        labelWelcome1.setFont(new Font("Verdana", Font.PLAIN, 18));

        labelWelcome1.setBounds(0, 12, 500, 25);
        p.add(labelWelcome1);

        JTextPane textAreaEmployee = new JTextPane();
        textAreaEmployee.setEditable(false);
        textAreaEmployee.setText(s.getAllEmployeeAsString());
        textAreaEmployee.setBounds(0, 50, 700, 200);
        p.add(textAreaEmployee);
    }
}