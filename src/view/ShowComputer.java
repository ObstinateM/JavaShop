package view;

import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.AddComputerStock;
import controller.CloseAndOpenEditComputer;
import controller.CloseAndOpenMain;
import controller.RefreshDataShowComputer;
import model.Computer;
import model.Shop;

public class ShowComputer extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private Computer computer;

    public ShowComputer(Shop shop) {
        setTitle("Ordinateur");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 210, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setBounds(6, 7, 120, 27);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        for (int i = 0; i < shop.getComputerList().size(); i++) {
            model.addElement(shop.getComputerList().get(i).getName());
        }
        comboBox.setModel(model);
        contentPane.add(comboBox);
        comboBox.doLayout();

        JLabel lblPrice = new JLabel("Prix : xxxx$");
        lblPrice.setBounds(6, 46, 200, 16);
        contentPane.add(lblPrice);

        JLabel lblInventory = new JLabel("X en stocks");
        lblInventory.setBounds(6, 66, 198, 16);
        contentPane.add(lblInventory);

        JLabel lblNumberOfSell = new JLabel("X vendus");
        lblNumberOfSell.setBounds(6, 86, 61, 16);
        contentPane.add(lblNumberOfSell);

        JLabel lblProc = new JLabel("Processeur : xxx");
        lblProc.setBounds(6, 104, 198, 16);
        contentPane.add(lblProc);

        JLabel lblRam = new JLabel("Ram : X GB");
        lblRam.setBounds(6, 123, 200, 16);
        contentPane.add(lblRam);

        JLabel lblHDD = new JLabel("HDD : X GB");
        lblHDD.setBounds(6, 143, 198, 16);
        contentPane.add(lblHDD);

        textField = new JTextField("0");
        textField.setBounds(6, 192, 82, 26);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblAddInventory = new JLabel("Ajouter au stocks");
        lblAddInventory.setBounds(6, 171, 200, 16);
        contentPane.add(lblAddInventory);

        JButton btnAddInventory = new JButton("Ajouter");
        btnAddInventory.setBounds(98, 192, 108, 29);
        btnAddInventory.addActionListener(new AddComputerStock(shop, textField, comboBox));
        contentPane.add(btnAddInventory);

        JButton btnClose = new JButton("Fermer");
        btnClose.setBounds(87, 230, 117, 29);
        btnClose.addActionListener(new CloseAndOpenMain(this, shop));
        contentPane.add(btnClose);

        JButton btnRefresh = new JButton("Refresh");
        btnRefresh.setBounds(124, 6, 82, 29);
        btnRefresh.addActionListener(new RefreshDataShowComputer(shop, computer, lblPrice,
                lblInventory, lblNumberOfSell, lblProc, lblHDD, lblRam, comboBox));
        contentPane.add(btnRefresh);

        JButton btnEdit = new JButton("Modfier");
        btnEdit.setBounds(0, 230, 88, 29);
        btnEdit.addActionListener(new CloseAndOpenEditComputer(this, shop, comboBox, computer));
        contentPane.add(btnEdit);
    }
}
