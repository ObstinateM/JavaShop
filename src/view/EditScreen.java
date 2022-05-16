package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.CloseAndOpenMain;
import controller.EditScreenController;
import model.Screen;
import model.Shop;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class EditScreen extends JFrame {

    private JPanel contentPane;
    private JTextField tfName;
    private JTextField tfPrice;
    private JTextField tfHeight;
    private JTextField tfWidth;
    private JTextField tfRefreshRate;
    private JTextField tfResponseTime;
    private Screen screen;

    public EditScreen(Shop shop, JComboBox<String> comboBox, Screen toEdit) {
        screen = shop.getScreenByName(comboBox.getSelectedItem().toString());

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 386);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        tfName = new JTextField();
        tfName.setText(screen.getName());
        tfName.setBounds(6, 23, 238, 26);
        contentPane.add(tfName);
        tfName.setColumns(10);

        tfPrice = new JTextField();
        tfPrice.setText(String.valueOf(screen.getPrice()));
        tfPrice.setBounds(6, 61, 238, 26);
        contentPane.add(tfPrice);
        tfPrice.setColumns(10);

        tfHeight = new JTextField();
        tfHeight.setText(String.valueOf(screen.getHeight()));
        tfHeight.setBounds(6, 104, 238, 26);
        contentPane.add(tfHeight);
        tfHeight.setColumns(10);

        tfWidth = new JTextField();
        tfWidth.setText(String.valueOf(screen.getWidth()));
        tfWidth.setHorizontalAlignment(SwingConstants.LEFT);
        tfWidth.setBounds(6, 143, 238, 26);
        contentPane.add(tfWidth);
        tfWidth.setColumns(10);

        tfRefreshRate = new JTextField();
        tfRefreshRate.setText(String.valueOf(screen.getRefreshRate()));
        tfRefreshRate.setBounds(6, 183, 238, 26);
        contentPane.add(tfRefreshRate);
        tfRefreshRate.setColumns(10);

        tfResponseTime = new JTextField();
        tfResponseTime.setText(String.valueOf(screen.getResponseTime()));
        tfResponseTime.setBounds(6, 232, 238, 26);
        contentPane.add(tfResponseTime);
        tfResponseTime.setColumns(10);

        JLabel lblName = new JLabel("Nom");
        lblName.setBounds(6, 6, 238, 16);
        contentPane.add(lblName);

        JLabel lblPrice = new JLabel("Prix");
        lblPrice.setBounds(6, 49, 238, 16);
        contentPane.add(lblPrice);

        JLabel lblHeight = new JLabel("Hauteur");
        lblHeight.setBounds(6, 89, 238, 16);
        contentPane.add(lblHeight);

        JLabel lblWidth = new JLabel("Largeur");
        lblWidth.setBounds(6, 128, 238, 16);
        contentPane.add(lblWidth);

        JLabel lblRefreshRate = new JLabel("Refresh rate");
        lblRefreshRate.setBounds(6, 168, 238, 16);
        contentPane.add(lblRefreshRate);

        JLabel lblResponseTime = new JLabel("Response time");
        lblResponseTime.setBounds(6, 215, 238, 16);
        contentPane.add(lblResponseTime);

        JButton btnSubmit = new JButton("Valider");
        btnSubmit.setBounds(127, 282, 117, 29);
        btnSubmit.addActionListener(new EditScreenController(this, shop, comboBox, tfName, tfPrice,
                tfHeight, tfWidth, tfRefreshRate, tfResponseTime));
        contentPane.add(btnSubmit);

        JButton btnClose = new JButton("Annuler");
        btnClose.setBounds(6, 282, 117, 29);
        btnClose.addActionListener(new CloseAndOpenMain(this, shop));
        contentPane.add(btnClose);
    }
}
