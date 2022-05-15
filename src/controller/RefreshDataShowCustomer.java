package controller;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import model.Customer;
import model.Shop;
import java.awt.event.ActionEvent;

public class RefreshDataShowCustomer implements ActionListener {
    private Shop shop;
    private Customer customer;
    private JComboBox<String> cbName;
    private JLabel lblDob;
    private JLabel lblSex;
    private JLabel lblId;
    private JLabel lblFidelityPts;
    private JLabel lblDiscount;
    private JButton btnClaim;

    public RefreshDataShowCustomer(Shop shop, Customer customer, JComboBox<String> cbName,
            JLabel lblDob, JLabel lblSex, JLabel lblId, JLabel lblFidelityPts, JLabel lblDiscount,
            JButton btnClaim) {
        this.shop = shop;
        this.customer = customer;
        this.cbName = cbName;
        this.lblDob = lblDob;
        this.lblSex = lblSex;
        this.lblId = lblId;
        this.lblFidelityPts = lblFidelityPts;
        this.lblDiscount = lblDiscount;
        this.btnClaim = btnClaim;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        customer = shop.getCustomerByName(cbName.getSelectedItem().toString());
        lblDob.setText("Date de naissance : " + customer.getDob());
        lblSex.setText("Sexe : " + customer.getSex());
        lblId.setText("Id : " + customer.getId());
        lblFidelityPts.setText("Nombre de points de fidelité : " + customer.getFidelityPoint());
        lblDiscount.setText("Nombre de coupons : " + customer.getNumberOfDiscountAvailable());
        btnClaim.setEnabled(customer.canClaimDiscount());
        btnClaim.setText(customer.canClaimDiscount() ? "Réclamer un coupon"
                : "Pas assez de points pour récupérer");
    }
}
