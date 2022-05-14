package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;

public class ResetPassword extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();
    private JTextField tfPassword;

    public ResetPassword(Shop s) {
        setTitle("Réinitialiser votre mot de passe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        setContentPane(p);
        setBounds(600, 600, 300, 100);
        setResizable(false);
        setVisible(true);
        // label
        JLabel labelPassword = new JLabel("Saisir votre nouveau mot de passe :");
        labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelPassword.setBounds(0, 0, 300, 20);
        p.add(labelPassword);
        // textfield
        tfPassword = new JTextField();
        tfPassword.setBounds(0, 20, 300, 20);
        tfPassword.setColumns(10);
        p.add(tfPassword);

        // button
        JButton btnReset = new JButton("Réinitialiser le mot de passe");
        btnReset.setBounds(0, 40, 300, 20);
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s.setPassword(tfPassword.getText());
                JFrame a = new JFrame();
                JOptionPane.showMessageDialog(a, "Mot de passe changez avec succès", "Password Changed", 2);
                dispose();

            }
        });
        p.add(btnReset);

    }
}