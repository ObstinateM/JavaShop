package controller;

import javax.swing.JFrame;

import model.OrderList;
import model.Shop;
import view.NewOrder;

public class CloseAndOpenNewOrder extends CloseAndOpen {
    private OrderList orderList;

    public CloseAndOpenNewOrder(JFrame f, Shop s) {
        super(f, s);

    }

    @Override
    public void open(Shop shop) {

        orderList = new OrderList();
        new NewOrder(shop, orderList);
    }
}
