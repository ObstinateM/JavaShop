package view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.ClaimDiscount;
import controller.CloseAndOpenMain;
import controller.RefreshDataShowCustomer;
import model.Customer;
import model.Shop;

public class ShowCustomer extends JFrame {

    private JPanel contentPane;
    private Customer customer;

    public ShowCustomer(Shop shop) {
        setTitle("Fiche client");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 270, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setBounds(6, 7, 123, 27);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        for (int i = 0; i < shop.getCustomerList().size(); i++) {
            Customer c = shop.getCustomerList().get(i);
            model.addElement(c.getFirstName() + " " + c.getLastName());
        }
        comboBox.setModel(model);
        contentPane.add(comboBox);
        comboBox.doLayout();

        JLabel lblDob = new JLabel("Date de naissance : 16 juin 2002");
        lblDob.setBounds(6, 46, 249, 16);
        contentPane.add(lblDob);

        JLabel lblSex = new JLabel("Sexe : Homme");
        lblSex.setBounds(6, 74, 249, 16);
        contentPane.add(lblSex);

        JLabel lblId = new JLabel("Id : 20200048");
        lblId.setBounds(6, 102, 249, 16);
        contentPane.add(lblId);

        JLabel lblFidelityPts = new JLabel("Nombre de points de fidelité : X pts");
        lblFidelityPts.setBounds(6, 130, 249, 16);
        contentPane.add(lblFidelityPts);

        JLabel lblDiscount = new JLabel("Nombre de coupons : X");
        lblDiscount.setBounds(6, 158, 177, 16);
        contentPane.add(lblDiscount);

        JButton btnClose = new JButton("Fermer");
        btnClose.setBounds(30, 237, 200, 29);
        btnClose.addActionListener(new CloseAndOpenMain(this, shop));
        contentPane.add(btnClose);

        JButton btnClaim = new JButton("Pas assez de points pour récupérer");
        btnClaim.setBounds(6, 196, 249, 29);
        btnClaim.addActionListener(new ClaimDiscount(shop, customer, comboBox));
        btnClaim.setEnabled(false);
        contentPane.add(btnClaim);

        JButton btnRefresh = new JButton("Refresh");
        btnRefresh.setBounds(138, 6, 117, 29);
        btnRefresh.addActionListener(new RefreshDataShowCustomer(shop, customer, comboBox, lblDob,
                lblSex, lblId, lblFidelityPts, lblDiscount, btnClaim));
        contentPane.add(btnRefresh);
    }
}
