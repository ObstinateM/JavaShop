package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.AddKeyboardStock;
import controller.CloseCurrent;
import controller.RefreshDataShowKeyboard;
import model.Keyboard;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class ShowKeyboard extends JFrame {

    private Keyboard keyboard;
    private JPanel contentPane;
    private JTextField tfNumberToAdd;

    public ShowKeyboard(Shop shop) {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 240, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JComboBox<String> cbName = new JComboBox<String>();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        for (int i = 0; i < shop.getKeyboardList().size(); i++) {
            model.addElement(shop.getKeyboardList().get(i).getName());
        }
        cbName.setModel(model);
        cbName.setBounds(16, 6, 117, 27);
        contentPane.add(cbName);
        cbName.doLayout();

        JLabel lblNumberSell = new JLabel("5 Vendus");
        lblNumberSell.setBounds(16, 45, 197, 16);
        contentPane.add(lblNumberSell);

        JLabel lblInventory = new JLabel("5 en stocks");
        lblInventory.setBounds(16, 66, 197, 16);
        contentPane.add(lblInventory);

        JLabel lblPrice = new JLabel("Prix : 500€");
        lblPrice.setBounds(16, 83, 197, 16);
        contentPane.add(lblPrice);

        JLabel lblMechanical = new JLabel("Le clavier est mechanique");
        lblMechanical.setBounds(16, 99, 197, 16);
        contentPane.add(lblMechanical);

        JLabel lblRGB = new JLabel("Le clavier n'est pas RGB");
        lblRGB.setBounds(16, 118, 197, 16);
        contentPane.add(lblRGB);

        JLabel lblKeypad = new JLabel("Le clavier n'a pas de keypad");
        lblKeypad.setBounds(16, 135, 197, 16);
        contentPane.add(lblKeypad);

        JLabel lblWireless = new JLabel("Le clavier est sans fil");
        lblWireless.setBounds(16, 153, 197, 16);
        contentPane.add(lblWireless);

        JLabel lblAddInventory = new JLabel("Ajouter des stocks");
        lblAddInventory.setBounds(16, 181, 197, 16);
        contentPane.add(lblAddInventory);

        tfNumberToAdd = new JTextField("0");
        tfNumberToAdd.setBounds(16, 202, 197, 26);
        contentPane.add(tfNumberToAdd);
        tfNumberToAdd.setColumns(10);

        JButton btnAdd = new JButton("Ajouter");
        btnAdd.setBounds(51, 233, 117, 29);
        btnAdd.addActionListener(new AddKeyboardStock(shop, tfNumberToAdd, cbName));
        contentPane.add(btnAdd);

        JButton btnCancel = new JButton("Close");
        btnCancel.setBounds(51, 274, 117, 29);
        btnCancel.addActionListener(new CloseCurrent(this));
        contentPane.add(btnCancel);

        JButton btnRefresh = new JButton("Refresh");
        btnRefresh.setBounds(145, 5, 89, 29);
        btnRefresh.addActionListener(new RefreshDataShowKeyboard(shop, keyboard, lblNumberSell,
                lblInventory, lblPrice, lblMechanical, lblRGB, lblKeypad, lblWireless, cbName));
        contentPane.add(btnRefresh);

        new RefreshDataShowKeyboard(shop, keyboard, lblNumberSell, lblInventory, lblPrice,
                lblMechanical, lblRGB, lblKeypad, lblWireless, cbName);
    }

    // public void refreshData() {
    // keyboard = shop.getKeyboardByName(cbName.getSelectedItem().toString());
    // lblNumberSell.setText(keyboard.getNumberOfSell() + " vendus");
    // lblInventory.setText(keyboard.getInventory() + " en stocks");
    // lblPrice.setText("Prix : " + keyboard.getPrice() + "€");
    // lblMechanical.setText(keyboard.isMechanical() ? "Le clavier est mechanique"
    // : "Le clavier n'est pas mechanique");
    // lblRGB.setText(keyboard.isRGB() ? "Le clavier est RGB" : "Le clavier n'est pas RGB");
    // lblKeypad.setText(
    // keyboard.hasKeypad() ? "Le clavier a un keypad" : "Le clavier n'a pas de keypad");
    // lblWireless.setText(keyboard.isWireless() ? "Le clavier est sans fil"
    // : "Le clavier n'est pas sans fil");
    // }
}
