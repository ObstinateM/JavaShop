package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.NewScreenController;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewScreen extends JFrame {

    private JPanel contentPane;
    private JTextField tfName;
    private JTextField tfPrice;
    private JTextField tfInventory;
    private JTextField tfWidth;
    private JTextField textField_4;
    private JTextField tfRefreshRate;
    private JTextField tfResponseTime;

    public NewScreen(Shop shop) {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 230, 610);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle = new JLabel("Ajouter un ecran");
        lblTitle.setBounds(74, 6, 110, 16);
        contentPane.add(lblTitle);

        JLabel lblName = new JLabel("Nom");
        lblName.setBounds(16, 34, 61, 16);
        contentPane.add(lblName);

        tfName = new JTextField();
        tfName.setBounds(16, 56, 130, 26);
        contentPane.add(tfName);
        tfName.setColumns(10);

        JLabel lblPrice = new JLabel("Prix");
        lblPrice.setBounds(16, 94, 61, 16);
        contentPane.add(lblPrice);

        tfPrice = new JTextField();
        tfPrice.setBounds(16, 122, 130, 26);
        contentPane.add(tfPrice);
        tfPrice.setColumns(10);

        JLabel lvlInventory = new JLabel("Nombre en stockes");
        lvlInventory.setBounds(16, 160, 130, 16);
        contentPane.add(lvlInventory);

        tfInventory = new JTextField();
        tfInventory.setBounds(16, 184, 130, 26);
        contentPane.add(tfInventory);
        tfInventory.setColumns(10);

        JLabel ldlWidth = new JLabel("Largeur");
        ldlWidth.setBounds(16, 216, 61, 16);
        contentPane.add(ldlWidth);

        tfWidth = new JTextField();
        tfWidth.setBounds(16, 244, 130, 26);
        contentPane.add(tfWidth);
        tfWidth.setColumns(10);

        JLabel lblHeight = new JLabel("Hauteur");
        lblHeight.setBounds(16, 282, 61, 16);
        contentPane.add(lblHeight);

        textField_4 = new JTextField();
        textField_4.setBounds(16, 310, 130, 26);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblRefreshRate = new JLabel("Refresh rate");
        lblRefreshRate.setBounds(16, 348, 83, 16);
        contentPane.add(lblRefreshRate);

        tfRefreshRate = new JTextField();
        tfRefreshRate.setBounds(16, 376, 130, 26);
        contentPane.add(tfRefreshRate);
        tfRefreshRate.setColumns(10);

        JLabel lblResponseTime = new JLabel("Temps de reponse");
        lblResponseTime.setBounds(16, 414, 130, 16);
        contentPane.add(lblResponseTime);

        tfResponseTime = new JTextField();
        tfResponseTime.setBounds(16, 442, 130, 26);
        contentPane.add(tfResponseTime);
        tfResponseTime.setColumns(10);

        JButton btnSubmit = new JButton("Valider");
        btnSubmit.setBounds(43, 496, 117, 29);
        btnSubmit.addActionListener(new NewScreenController(shop, this, tfName, tfPrice,
                tfInventory, tfWidth, textField_4, tfRefreshRate, tfResponseTime));
        contentPane.add(btnSubmit);

        JButton btnCancel = new JButton("Annuler");
        btnCancel.setBounds(43, 530, 117, 29);
        contentPane.add(btnCancel);
    }

}
