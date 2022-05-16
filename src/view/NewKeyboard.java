package view;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.CloseAndOpenMain;
import controller.NewKeyboardController;
import model.Shop;

public class NewKeyboard extends JFrame {

    private JPanel contentPane;
    private JTextField tfName;
    private JTextField tfPrice;
    private JTextField tfInventory;

    public NewKeyboard(Shop shop) {
        setTitle("Nouveau clavier");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 200, 479);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblKeyboard = new JLabel("Ajouter un clavier");
        lblKeyboard.setBounds(40, 6, 119, 16);
        contentPane.add(lblKeyboard);

        JLabel lblName = new JLabel("Nom");
        lblName.setBounds(6, 34, 61, 16);
        contentPane.add(lblName);

        tfName = new JTextField();
        tfName.setBounds(6, 54, 130, 26);
        contentPane.add(tfName);
        tfName.setColumns(10);

        JLabel lblPrice = new JLabel("Prix");
        lblPrice.setBounds(6, 88, 61, 16);
        contentPane.add(lblPrice);

        tfPrice = new JTextField();
        tfPrice.setBounds(6, 116, 130, 26);
        contentPane.add(tfPrice);
        tfPrice.setColumns(10);

        JLabel lblNewLabel = new JLabel("Nombre en stocks");
        lblNewLabel.setBounds(6, 154, 119, 16);
        contentPane.add(lblNewLabel);

        tfInventory = new JTextField();
        tfInventory.setBounds(6, 182, 130, 26);
        contentPane.add(tfInventory);
        tfInventory.setColumns(10);

        JCheckBox chckbxIsMechanical = new JCheckBox("Mechanical");
        chckbxIsMechanical.setBounds(8, 230, 128, 23);
        contentPane.add(chckbxIsMechanical);

        JCheckBox chckbxIsRGB = new JCheckBox("RGB");
        chckbxIsRGB.setBounds(8, 265, 128, 23);
        contentPane.add(chckbxIsRGB);

        JCheckBox chckbxIsWireless = new JCheckBox("Wireless");
        chckbxIsWireless.setBounds(8, 300, 128, 23);
        contentPane.add(chckbxIsWireless);

        JCheckBox chckbxHasKeypad = new JCheckBox("Keypad");
        chckbxHasKeypad.setBounds(8, 335, 128, 23);
        contentPane.add(chckbxHasKeypad);

        JButton btnSubmit = new JButton("Valider");
        btnSubmit.setBounds(40, 377, 117, 29);
        btnSubmit.addActionListener(new NewKeyboardController(shop, this, tfName, tfPrice,
                tfInventory, chckbxIsMechanical, chckbxIsRGB, chckbxIsWireless, chckbxHasKeypad));
        contentPane.add(btnSubmit);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(40, 404, 117, 29);
        btnCancel.addActionListener(new CloseAndOpenMain(this, shop));
        contentPane.add(btnCancel);
    }
}
