package controller;

import javax.swing.JFrame;
import model.OrderList;
import model.Shop;
import view.MainInterface;

public class CloseAndOpenMainWithNewOrder extends CloseAndOpen {
    private OrderList orderList;

    public CloseAndOpenMainWithNewOrder(JFrame f, Shop s, OrderList orderList) {
        super(f, s);
        this.orderList = orderList;
    }

    @Override
    public void open(Shop shop) {
        shop.addOrderList(orderList);
        new MainInterface(shop);
    }
}
