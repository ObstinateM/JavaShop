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

public class NewOrderScreen extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField idClient;
    private JComboBox<String> comboBox;
    private JComboBox comboBoxNumber;

    String s1[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "20" };

    public NewOrderScreen(Shop shop, OrderList orderList) {
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
        JLabel totalPrice = new JLabel("" + shop.getScreenList().get(0).getPrice());
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
        for (int i = 0; i < shop.getScreenList().size(); i++) {
            model.addElement(shop.getScreenList().get(i).getName());
        }
        comboBox.setModel(model);
        contentPane.add(comboBox);
        comboBox.doLayout();
        // label width height refreshRate refreshTime
        JLabel width = new JLabel("" + shop.getScreenList().get(0).getWidth());
        width.setBounds(100, 120, 280, 120);
        contentPane.add(width);
        JLabel height = new JLabel("" + shop.getScreenList().get(0).getHeight());
        height.setBounds(100, 150, 280, 120);
        contentPane.add(height);
        JLabel refreshRate = new JLabel("" + shop.getScreenList().get(0).getRefreshRate());
        refreshRate.setBounds(100, 180, 280, 120);
        contentPane.add(refreshRate);
        JLabel responseTime = new JLabel("" + shop.getScreenList().get(0).getResponseTime());
        responseTime.setBounds(100, 210, 280, 120);
        contentPane.add(responseTime);
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

        // call updater
        comboBoxNumber
                .addActionListener(
                        new UpdateDataForOrderKeyboard1(comboBoxNumber, comboBox, totalPrice, this, shop));
        comboBox.addActionListener(
                new UpdateDataForOrderKeyboard2(comboBoxNumber, comboBox, totalPrice, lblUnityPrice, this, shop));
        btnValidate.addActionListener(new NewOrderScreenController(comboBox, comboBoxNumber, totalPrice, this, shop,
                orderList, width, height, refreshRate, responseTime));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
