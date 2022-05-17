package controller;

import javax.swing.JFrame;
import model.OrderList;
import model.Shop;
import view.NewOrderKeyboard;

public class CloseAndOpenNewOrderKeyboard extends CloseAndOpen {
    private OrderList orderList;

    public CloseAndOpenNewOrderKeyboard(JFrame f, Shop s, OrderList orderList) {
        super(f, s);
        this.orderList = orderList;
    }

    @Override
    public void open(Shop shop) {
        new NewOrderKeyboard(shop, orderList);
    }
}
