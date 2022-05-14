package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.CloseAndOpenMain;
import controller.NewComputerController;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewComputer extends JFrame {

    private JPanel contentPane;
    private JTextField tfName;
    private JTextField tdPrice;
    private JTextField tfInventory;
    private JTextField tfProc;
    private JTextField tfRam;
    private JTextField tfHDD;

    public NewComputer(Shop shop) {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 200, 563);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle = new JLabel("Ajouter un ordinateur");
        lblTitle.setBounds(28, 20, 142, 16);
        contentPane.add(lblTitle);

        JLabel lblName = new JLabel("Nom");
        lblName.setBounds(28, 57, 61, 16);
        contentPane.add(lblName);

        JLabel lblPrice = new JLabel("Prix");
        lblPrice.setBounds(28, 113, 61, 16);
        contentPane.add(lblPrice);

        JLabel lblInventory = new JLabel("Nombre en stock");
        lblInventory.setBounds(28, 170, 125, 16);
        contentPane.add(lblInventory);

        JLabel lblProc = new JLabel("Processeur");
        lblProc.setBounds(28, 228, 75, 16);
        contentPane.add(lblProc);

        JLabel lblRam = new JLabel("Nombre GB Ram");
        lblRam.setBounds(28, 294, 108, 16);
        contentPane.add(lblRam);

        JLabel lblHDD = new JLabel("Nombre GB Stockage");
        lblHDD.setBounds(28, 355, 142, 16);
        contentPane.add(lblHDD);

        tfName = new JTextField();
        tfName.setBounds(28, 85, 130, 26);
        contentPane.add(tfName);
        tfName.setColumns(10);

        tdPrice = new JTextField();
        tdPrice.setBounds(28, 132, 130, 26);
        contentPane.add(tdPrice);
        tdPrice.setColumns(10);

        tfInventory = new JTextField();
        tfInventory.setBounds(28, 190, 130, 26);
        contentPane.add(tfInventory);
        tfInventory.setColumns(10);

        tfProc = new JTextField();
        tfProc.setBounds(28, 256, 130, 26);
        contentPane.add(tfProc);
        tfProc.setColumns(10);

        tfRam = new JTextField();
        tfRam.setBounds(28, 320, 130, 26);
        contentPane.add(tfRam);
        tfRam.setColumns(10);

        tfHDD = new JTextField();
        tfHDD.setBounds(28, 383, 130, 26);
        contentPane.add(tfHDD);
        tfHDD.setColumns(10);

        JButton btnSubmit = new JButton("Valider");
        btnSubmit.setBounds(28, 442, 117, 29);
        btnSubmit.addActionListener(new NewComputerController(shop, this, tfName, tdPrice,
                tfInventory, tfProc, tfRam, tfHDD));
        contentPane.add(btnSubmit);

        JButton btnCancel = new JButton("Annuler");
        btnCancel.setBounds(28, 475, 117, 29);
        btnCancel.addActionListener(new CloseAndOpenMain(this, shop));
        contentPane.add(btnCancel);
    }
}
