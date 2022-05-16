package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import controller.ResetPasswordController;
import model.Shop;

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

        JLabel labelPassword = new JLabel("Saisir votre nouveau mot de passe :");
        labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelPassword.setBounds(0, 0, 300, 20);
        p.add(labelPassword);

        tfPassword = new JTextField();
        tfPassword.setBounds(0, 20, 300, 20);
        tfPassword.setColumns(10);
        p.add(tfPassword);

        JButton btnReset = new JButton("Réinitialiser le mot de passe");
        btnReset.setBounds(0, 40, 300, 20);
        btnReset.addActionListener(new ResetPasswordController(this, s, tfPassword));
        p.add(btnReset);
    }
}
