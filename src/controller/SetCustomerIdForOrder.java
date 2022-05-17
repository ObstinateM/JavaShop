package controller;

import javax.swing.JComboBox;
import java.awt.event.*;

import model.Customer;
import model.OrderList;
import model.Shop;

public class SetCustomerIdForOrder implements ActionListener {
    private OrderList orderList;
    private JComboBox<String> comboBox;
    private Shop shop;

    public SetCustomerIdForOrder(Shop shop, JComboBox<String> idClient, OrderList orderList) {
        this.shop = shop;
        this.orderList = orderList;
        this.comboBox = idClient;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> cb = (JComboBox<String>) e.getSource();
        String newSelection = (String) cb.getSelectedItem();

        int value = shop.getCustomerByFirstName(newSelection.split(" ")[0]);
        orderList.setCustomerId(value);
    }

}
