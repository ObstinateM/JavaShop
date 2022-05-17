package controller;

import javax.swing.JFrame;
import model.OrderList;
import model.Shop;
import view.NewOrderComputer;

public class CloseAndOpenNewOrderComputer extends CloseAndOpen {
    private OrderList orderList;

    public CloseAndOpenNewOrderComputer(JFrame f, Shop s, OrderList orderList) {
        super(f, s);
        this.orderList = orderList;
    }

    @Override
    public void open(Shop shop) {
        new NewOrderComputer(shop, orderList);
    }
}
