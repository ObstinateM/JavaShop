package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Customer;
import model.Shop;
import java.awt.event.ActionEvent;

public class ClaimDiscount implements ActionListener {
    private Shop shop;
    private Customer customer;
    private JComboBox<String> cbName;

    public ClaimDiscount(Shop shop, Customer customer, JComboBox<String> cbName) {
        this.shop = shop;
        this.customer = customer;
        this.cbName = cbName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        customer = shop.getCustomerByName(cbName.getSelectedItem().toString());

        if (customer.canClaimDiscount()) {
            customer.claimDiscount();
            JOptionPane.showMessageDialog(null, "Coupon ajouté");
            return;
        }

        JOptionPane.showMessageDialog(null, "Vous ne pouvez pas réclamer de coupon");
    }
}
