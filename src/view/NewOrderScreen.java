package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.*;
import model.OrderList;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.*;

public class NewOrderScreen extends JFrame {

    private JPanel contentPane;
    private JComboBox<String> comboBox;
    private JComboBox<String> comboBoxNumber;

    String[] s1 = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

    public NewOrderScreen(Shop shop, OrderList orderList) {
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

        JLabel totalPrice = new JLabel("" + shop.getScreenList().get(0).getPrice());
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
        for (int i = 0; i < shop.getScreenList().size(); i++) {
            model.addElement(shop.getScreenList().get(i).getName());
        }
        comboBox.setModel(model);
        contentPane.add(comboBox);
        comboBox.doLayout();

        JLabel width = new JLabel("Largeur : " + shop.getScreenList().get(0).getWidth() + " cm");
        width.setBounds(20, 120, 280, 120);
        contentPane.add(width);

        JLabel height = new JLabel("Hauteur : " + shop.getScreenList().get(0).getHeight() + " cm");
        height.setBounds(20, 150, 280, 120);
        contentPane.add(height);

        JLabel refreshRate = new JLabel("Hz : " + shop.getScreenList().get(0).getRefreshRate() + " hz");
        refreshRate.setBounds(20, 180, 280, 120);
        contentPane.add(refreshRate);

        JLabel responseTime = new JLabel("Temps de réponse : " + shop.getScreenList().get(0).getResponseTime() + " ms");
        responseTime.setBounds(20, 210, 280, 120);
        contentPane.add(responseTime);

        JButton btnValidate = new JButton("Valider");
        btnValidate.setBounds(63, 400, 100, 25);
        btnValidate.setBackground(Color.decode("#AAFF00"));
        contentPane.add(btnValidate);

        JButton btnCancel = new JButton("Annuler");
        btnCancel.setBounds(63, 450, 100, 25);
        btnCancel.setBackground(Color.decode("#C70039"));
        contentPane.add(btnCancel);
        btnCancel.addActionListener(new CloseAndOpenMain(this, shop));
        comboBoxNumber
                .addActionListener(new UpdateDataForOrderScreen1(comboBox, totalPrice, shop));
        comboBox.addActionListener(new UpdateDataForOrderScreen2(comboBoxNumber, comboBox,
                totalPrice, lblUnityPrice, shop, width, height, refreshRate, responseTime));
        btnValidate.addActionListener(new NewOrderScreenController(comboBox, comboBoxNumber,
                totalPrice, this, shop, orderList, width, height, refreshRate, responseTime));
    }
}
