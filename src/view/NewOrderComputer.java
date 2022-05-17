package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.*;
import model.OrderList;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.*;

public class NewOrderComputer extends JFrame {

    private JPanel contentPane;
    private JTextField idClient;
    private JTextField orderName;
    private JComboBox<String> comboIdClient;
    private JComboBox<String> comboBox;
    private JComboBox comboBoxNumber;
    String[] s1 = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "20" };

    public NewOrderComputer(Shop shop, OrderList orderList) {
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 500, 250, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel lblUnityPrice = new JLabel("Prix par article : ");
        lblUnityPrice.setBounds(20, 80, 200, 120);
        contentPane.add(lblUnityPrice);
        JLabel totalPrice = new JLabel("" + shop.getComputerList().get(0).getPrice());
        totalPrice.setBounds(100, 320, 280, 120);
        totalPrice.setFont(new Font("Verdana", Font.PLAIN, 15));
        contentPane.add(totalPrice);
        JLabel lblTotalPrice = new JLabel("Prix total : ");
        lblTotalPrice.setBounds(20, 320, 280, 120);
        lblTotalPrice.setFont(new Font("Verdana", Font.PLAIN, 15));
        contentPane.add(lblTotalPrice);
        JLabel lblProc = new JLabel("" + shop.getComputerList().get(0).getProc());
        lblProc.setBounds(20, 120, 200, 20);
        contentPane.add(lblProc);
        JLabel lblRam = new JLabel("" + shop.getComputerList().get(0).getRamGB());
        lblRam.setBounds(20, 150, 200, 20);
        contentPane.add(lblRam);
        JLabel lblHdd = new JLabel("" + shop.getComputerList().get(0).getHddGB());
        lblHdd.setBounds(20, 180, 200, 20);
        contentPane.add(lblHdd);
        JLabel lblNumber = new JLabel("Nombre d'article :");
        lblNumber.setBounds(20, 60, 200, 20);
        contentPane.add(lblNumber);
        comboBoxNumber = new JComboBox(s1);
        comboBoxNumber.setBounds(20, 80, 200, 30);
        contentPane.add(comboBoxNumber);
        comboBoxNumber.doLayout();
        comboBox = new JComboBox<String>();
        comboBox.setBounds(20, 20, 200, 30);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        for (int i = 0; i < shop.getComputerList().size(); i++) {
            model.addElement(shop.getComputerList().get(i).getName());
        }
        comboBox.setModel(model);
        contentPane.add(comboBox);
        comboBox.doLayout();
        JButton btnValidate = new JButton("Valider");
        btnValidate.setBounds(63, 400, 100, 25);
        btnValidate.setBackground(Color.decode("#AAFF00"));
        contentPane.add(btnValidate);
        btnValidate.addActionListener(new NewOrderComputerController(comboBox, comboBoxNumber,
                totalPrice, this, shop, orderList, lblProc, lblRam, lblHdd));
        JButton btnCancel = new JButton("Annuler");
        btnCancel.setBounds(63, 450, 100, 25);
        btnCancel.setBackground(Color.decode("#C70039"));
        contentPane.add(btnCancel);
        btnCancel.addActionListener(new CloseAndOpenMain(this, shop));
        comboBoxNumber
                .addActionListener(
                        new UpdateDataForOrderComputer1(comboBoxNumber, comboBox, totalPrice, this, shop));
        comboBox.addActionListener(
                new UpdateDataForOrderComputer2(comboBoxNumber, comboBox, totalPrice, lblUnityPrice, this, shop));

    }

}
