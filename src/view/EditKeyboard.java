package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import model.Keyboard;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import controller.CloseAndOpenMain;
import controller.EditKeyboardController;

public class EditKeyboard extends JFrame {

    private JPanel contentPane;
    private JTextField tfName;
    private JTextField tfPrice;

    public EditKeyboard(Shop shop, JComboBox<String> comboBox, Keyboard keyboard) {
        keyboard = shop.getKeyboardByName(comboBox.getSelectedItem().toString());

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 245, 340);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblName = new JLabel("Nom");
        lblName.setBounds(6, 6, 233, 16);
        contentPane.add(lblName);

        tfName = new JTextField(keyboard.getName());
        tfName.setBounds(6, 32, 233, 26);
        contentPane.add(tfName);
        tfName.setColumns(10);

        JLabel lblPrice = new JLabel("Prix");
        lblPrice.setBounds(6, 70, 61, 16);
        contentPane.add(lblPrice);

        tfPrice = new JTextField(String.valueOf(keyboard.getPrice()));
        tfPrice.setBounds(6, 92, 233, 26);
        contentPane.add(tfPrice);
        tfPrice.setColumns(10);

        JCheckBox cbMechanical = new JCheckBox("Mechanique");
        cbMechanical.setBounds(6, 130, 128, 23);
        cbMechanical.setSelected(keyboard.isMechanical());
        contentPane.add(cbMechanical);

        JCheckBox cbRGB = new JCheckBox("RGB");
        cbRGB.setBounds(6, 162, 128, 23);
        cbRGB.setSelected(keyboard.isRGB());
        contentPane.add(cbRGB);

        JCheckBox cbWireless = new JCheckBox("Wireless");
        cbWireless.setBounds(6, 199, 128, 23);
        cbWireless.setSelected(keyboard.isWireless());
        contentPane.add(cbWireless);

        JCheckBox cbKeypad = new JCheckBox("Keypad");
        cbKeypad.setBounds(6, 234, 128, 23);
        cbKeypad.setSelected(keyboard.hasKeypad());
        contentPane.add(cbKeypad);

        JButton btnCancel = new JButton("Annuler");
        btnCancel.setBounds(6, 271, 117, 29);
        btnCancel.addActionListener(new CloseAndOpenMain(this, shop));
        contentPane.add(btnCancel);

        JButton btnSubmit = new JButton("Valider");
        btnSubmit.setBounds(122, 269, 117, 29);
        btnSubmit.addActionListener(new EditKeyboardController(this, shop, comboBox, tfName,
                tfPrice, cbMechanical, cbRGB, cbWireless, cbKeypad));
        contentPane.add(btnSubmit);
    }
}
