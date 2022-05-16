package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.*;
import model.OrderList;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.sound.midi.Synthesizer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;

public class NewOrderKeyboard extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField idClient;
    private JTextField orderName;
    private JComboBox<String> comboIdClient;
    private JComboBox<String> comboBox;
    private JComboBox comboBoxNumber;
    private JCheckBox isMechanical;
    private JCheckBox isRGB;
    private JCheckBox isWireless;
    private JCheckBox hasKeypad;
    String s1[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "20" };

    public NewOrderKeyboard(Shop shop, OrderList orderList) {
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 500, 250, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        // label unity prix euro
        JLabel lblUnityPrice = new JLabel("Prix par article : ");
        lblUnityPrice.setBounds(20, 80, 200, 120);
        contentPane.add(lblUnityPrice);
        JLabel totalPrice = new JLabel("" + shop.getKeyBoardList().get(0).getPrice());
        totalPrice.setBounds(100, 320, 280, 120);
        totalPrice.setFont(new Font("Verdana", Font.PLAIN, 15));
        contentPane.add(totalPrice);
        // label for value of total price
        JLabel lblTotalPrice = new JLabel("Prix total : ");
        lblTotalPrice.setBounds(20, 320, 280, 120);
        lblTotalPrice.setFont(new Font("Verdana", Font.PLAIN, 15));
        contentPane.add(lblTotalPrice);

        // number of computer in the order
        JLabel lblNumber = new JLabel("Nombre d'article :");
        lblNumber.setBounds(20, 60, 200, 20);
        contentPane.add(lblNumber);
        comboBoxNumber = new JComboBox(s1);
        comboBoxNumber.setBounds(20, 80, 200, 30);
        contentPane.add(comboBoxNumber);
        comboBoxNumber.doLayout();

        // combo box for computer
        comboBox = new JComboBox<String>();
        comboBox.setBounds(20, 20, 200, 30);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        for (int i = 0; i < shop.getKeyBoardList().size(); i++) {
            model.addElement(shop.getKeyBoardList().get(i).getName());
        }
        comboBox.setModel(model);
        contentPane.add(comboBox);
        comboBox.doLayout();

        // button
        JButton btnValidate = new JButton("Valider");
        btnValidate.setBounds(63, 400, 100, 25);
        btnValidate.setBackground(Color.decode("#AAFF00"));
        contentPane.add(btnValidate);

        JButton btnCancel = new JButton("Annuler");
        btnCancel.setBounds(63, 450, 100, 25);
        btnCancel.setBackground(Color.decode("#C70039"));
        contentPane.add(btnCancel);
        btnCancel.addActionListener(new CloseAndOpenMain(this, shop));

        // checkbox
        isMechanical = new JCheckBox("Mecanique");
        isMechanical.setBounds(20, 240, 200, 20);
        contentPane.add(isMechanical);
        isRGB = new JCheckBox("RGB");
        isRGB.setBounds(20, 260, 200, 20);
        contentPane.add(isRGB);

        isWireless = new JCheckBox("Wireless");
        isWireless.setBounds(20, 280, 200, 20);
        contentPane.add(isWireless);

        hasKeypad = new JCheckBox("Keypad");
        hasKeypad.setBounds(20, 300, 200, 20);
        contentPane.add(hasKeypad);
        // call updater
        comboBoxNumber
                .addActionListener(
                        new UpdateDataForOrderKeyboard1(comboBoxNumber, comboBox, totalPrice, this, shop));
        comboBox.addActionListener(
                new UpdateDataForOrderKeyboard2(comboBoxNumber, comboBox, totalPrice, lblUnityPrice, this, shop));
        btnValidate.addActionListener(new NewOrderKeyboardController(comboBox, comboBoxNumber, totalPrice, this, shop,
                orderList, isMechanical, isRGB, isWireless, hasKeypad));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
