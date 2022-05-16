package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.AddScreenStock;
import controller.CloseAndOpenMain;
import controller.RefreshDataShowScreen;
import model.Screen;
import model.Shop;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowScreen extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private Screen screen;

    public ShowScreen(Shop shop) {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 210, 310);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JComboBox<String> comboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        for (int i = 0; i < shop.getScreenList().size(); i++) {
            model.addElement(shop.getScreenList().get(i).getName());
        }
        comboBox.setModel(model);
        comboBox.setBounds(6, 6, 113, 27);
        contentPane.add(comboBox);
        comboBox.doLayout();

        JLabel lblPrice = new JLabel("Prix:  XXX€");
        lblPrice.setBounds(6, 45, 198, 16);
        contentPane.add(lblPrice);

        JLabel lblInventory = new JLabel("X en stocks");
        lblInventory.setBounds(6, 66, 198, 16);
        contentPane.add(lblInventory);

        JLabel lblNumberOfSell = new JLabel("X Vendus");
        lblNumberOfSell.setBounds(6, 84, 198, 16);
        contentPane.add(lblNumberOfSell);

        JLabel lblWidth = new JLabel("Width : X");
        lblWidth.setBounds(6, 101, 198, 16);
        contentPane.add(lblWidth);

        JLabel lblHeight = new JLabel("Height : X");
        lblHeight.setBounds(6, 118, 198, 16);
        contentPane.add(lblHeight);

        JLabel lblResponseTime = new JLabel("Response Time : X ms");
        lblResponseTime.setBounds(6, 138, 198, 16);
        contentPane.add(lblResponseTime);

        JLabel lblRefreshRate = new JLabel("Refresh Rate : X Hz");
        lblRefreshRate.setBounds(6, 158, 198, 16);
        contentPane.add(lblRefreshRate);

        JLabel lblAddTitle = new JLabel("Ajouter au stocks");
        lblAddTitle.setBounds(6, 186, 198, 16);
        contentPane.add(lblAddTitle);

        textField = new JTextField();
        textField.setText("0");
        textField.setBounds(6, 206, 73, 26);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnAddInventory = new JButton("Ajouter");
        btnAddInventory.setBounds(91, 206, 117, 29);
        btnAddInventory.addActionListener(new AddScreenStock(shop, textField, comboBox));
        contentPane.add(btnAddInventory);

        JButton btnClose = new JButton("Fermer");
        btnClose.setBounds(43, 244, 117, 29);
        btnClose.addActionListener(new CloseAndOpenMain(this, shop));
        contentPane.add(btnClose);

        JButton btnRefresh = new JButton("Refresh");
        btnRefresh.setBounds(122, 5, 82, 29);
        btnRefresh.addActionListener(new RefreshDataShowScreen(shop, screen, lblPrice, lblInventory,
                lblNumberOfSell, lblWidth, lblHeight, lblResponseTime, lblRefreshRate, comboBox));
        contentPane.add(btnRefresh);
    }

}
