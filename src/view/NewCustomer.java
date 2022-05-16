package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import controller.CloseAndOpenMain;
import controller.NewCustomerController;
import model.Shop;

public class NewCustomer extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel p = new JPanel();
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JTextField dob;

    String[] optionsToChoose = {"Homme", "Femme"};

    public NewCustomer(Shop s) {
        setTitle("Ajouter un client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        setContentPane(p);
        setBounds(100, 100, 500, 600);

        setVisible(true);

        JLabel labelFirstName = new JLabel("Prénom :");
        labelFirstName.setHorizontalAlignment(SwingConstants.CENTER);
        labelFirstName.setBounds(100, 82, 300, 25);
        p.add(labelFirstName);

        JLabel labelLastName = new JLabel("Nom :");
        labelLastName.setHorizontalAlignment(SwingConstants.CENTER);
        labelLastName.setBounds(100, 150, 300, 25);
        p.add(labelLastName);

        JLabel labelDob = new JLabel("Date de naissance* :");
        labelDob.setHorizontalAlignment(SwingConstants.CENTER);
        labelDob.setBounds(100, 220, 300, 25);
        p.add(labelDob);

        JLabel labelIndication =
                new JLabel("*Veuillez entrer votre date de naissance sous ce format : JJ/MM/AAAA");
        labelIndication.setForeground(Color.RED);
        labelIndication.setHorizontalAlignment(SwingConstants.CENTER);
        labelIndication.setBounds(50, 260, 400, 25);
        p.add(labelIndication);

        JLabel labelSex = new JLabel("Sexe :");
        labelSex.setHorizontalAlignment(SwingConstants.CENTER);
        labelSex.setBounds(100, 320, 300, 25);
        p.add(labelSex);

        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(100, 350, 300, 25);
        p.add(jComboBox);

        tfFirstName = new JTextField();
        tfFirstName.setBounds(100, 100, 300, 25);
        p.add(tfFirstName);

        tfLastName = new JTextField();
        tfLastName.setBounds(100, 170, 300, 25);
        p.add(tfLastName);

        dob = new JTextField();
        dob.setBounds(100, 240, 300, 25);
        p.add(dob);

        JButton btnNewEmploye = new JButton("Valider");
        btnNewEmploye.setBounds(100, 400, 300, 25);
        btnNewEmploye.addActionListener(
                new NewCustomerController(this, s, tfFirstName, tfLastName, dob, jComboBox));
        p.add(btnNewEmploye);

        JButton btnBack = new JButton("Retour");
        btnBack.setBounds(10, 500, 100, 30);
        btnBack.setBackground(Color.decode("#C70039"));
        btnBack.addActionListener(new CloseAndOpenMain(this, s));
        p.add(btnBack);
    }
}
