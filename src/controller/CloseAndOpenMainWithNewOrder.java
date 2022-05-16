package controller;

import javax.swing.JFrame;

import model.OrderList;
import model.Shop;
import view.MainInterface;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CloseAndOpenMainWithNewOrder implements ActionListener {
    private JFrame frame;
    private Shop shop;
    private OrderList orderList;

    public CloseAndOpenMainWithNewOrder(JFrame frame, Shop shop, OrderList orderList) {
        this.frame = frame;
        this.shop = shop;
        this.orderList = orderList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        shop.addOrderList(orderList);
        frame.dispose();
        new MainInterface(shop);
    }
}
