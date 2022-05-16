package controller;

import javax.swing.JFrame;
import model.OrderList;
import model.Shop;
import view.NewOrderScreen;

public class CloseAndOpenNewOrderScreen extends CloseAndOpen {
    private OrderList orderList;

    public CloseAndOpenNewOrderScreen(JFrame f, Shop s, OrderList orderList) {
        super(f, s);
        this.orderList = orderList;
    }

    @Override
    public void open(Shop shop) {
        new NewOrderScreen(shop, this.orderList);
    }
}
