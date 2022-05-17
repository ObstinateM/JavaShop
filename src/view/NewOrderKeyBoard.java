package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import controller.UpdateDataForOrderKeyboard1;
import controller.UpdateDataForOrderKeyboard2;
import controller.NewOrderKeyboardController;
import controller.CloseAndOpenMain;
import model.OrderList;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.*;

public class NewOrderKeyboard extends JFrame {

    private JPanel contentPane;
    private JComboBox<String> comboBox;
    private JComboBox<String> comboBoxNumber;
    private JLabel isMechanical;
    private JLabel isRGB;
    private JLabel isWireless;
    private JLabel hasKeypad;
    String[] s1 = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "20" };

    public NewOrderKeyboard(Shop shop, OrderList orderList) {
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 250, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUnityPrice = new JLabel("Prix par article : ");
        lblUnityPrice.setBounds(20, 80, 200, 120);
        contentPane.add(lblUnityPrice);

        JLabel totalPrice = new JLabel("" + shop.getKeyboardList().get(0).getPrice());
        totalPrice.setBounds(100, 320, 280, 120);
        totalPrice.setFont(new Font("Verdana", Font.PLAIN, 15));
        contentPane.add(totalPrice);

        JLabel lblTotalPrice = new JLabel("Prix total : ");
        lblTotalPrice.setBounds(20, 320, 280, 120);
        lblTotalPrice.setFont(new Font("Verdana", Font.PLAIN, 15));
        contentPane.add(lblTotalPrice);

        JLabel lblNumber = new JLabel("Nombre d'article :");
        lblNumber.setBounds(20, 60, 200, 20);
        contentPane.add(lblNumber);
        comboBoxNumber = new JComboBox<String>(s1);
        comboBoxNumber.setBounds(20, 80, 200, 30);
        contentPane.add(comboBoxNumber);
        comboBoxNumber.doLayout();

        comboBox = new JComboBox<String>();
        comboBox.setBounds(20, 20, 200, 30);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        for (int i = 0; i < shop.getKeyboardList().size(); i++) {
            model.addElement(shop.getKeyboardList().get(i).getName());
        }
        comboBox.setModel(model);
        contentPane.add(comboBox);
        comboBox.doLayout();

        JButton btnValidate = new JButton("Valider");
        btnValidate.setBounds(63, 400, 100, 25);
        btnValidate.setBackground(Color.decode("#AAFF00"));
        contentPane.add(btnValidate);

        JButton btnCancel = new JButton("Annuler");
        btnCancel.setBounds(63, 450, 100, 25);
        btnCancel.setBackground(Color.decode("#C70039"));
        contentPane.add(btnCancel);
        btnCancel.addActionListener(new CloseAndOpenMain(this, shop));

        isMechanical = new JLabel("Mecanique : " + shop.getKeyboardList().get(0).isMechanical());
        isMechanical.setBounds(20, 240, 200, 20);
        contentPane.add(isMechanical);

        isRGB = new JLabel("RGB : " + shop.getKeyboardList().get(0).isRGB());
        isRGB.setBounds(20, 260, 200, 20);
        contentPane.add(isRGB);

        isWireless = new JLabel("Wireless : " + shop.getKeyboardList().get(0).isWireless());
        isWireless.setBounds(20, 280, 200, 20);
        contentPane.add(isWireless);

        hasKeypad = new JLabel("Keypad : " + shop.getKeyboardList().get(0).hasKeypad());
        hasKeypad.setBounds(20, 300, 200, 20);
        contentPane.add(hasKeypad);
        comboBoxNumber
                .addActionListener(new UpdateDataForOrderKeyboard1(comboBox, totalPrice, shop));
        comboBox.addActionListener(new UpdateDataForOrderKeyboard2(comboBoxNumber, comboBox,
                totalPrice, lblUnityPrice, shop, isMechanical, isRGB, isWireless, hasKeypad));
        btnValidate.addActionListener(new NewOrderKeyboardController(comboBox, comboBoxNumber,
                totalPrice, this, shop, orderList, isMechanical, isRGB, isWireless, hasKeypad));
    }
}
