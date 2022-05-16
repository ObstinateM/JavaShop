package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

import model.OrderList;
import model.Shop;
import view.NewOrderScreen;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewOrderScreen implements ActionListener {
    private JFrame frame;
    private Shop s;
    private OrderList orderList;

    public CloseAndOpenNewOrderScreen(JFrame f, Shop s, OrderList orderList) {
        this.frame = f;
        this.s = s;
        this.orderList = orderList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewOrderScreen(this.s, this.orderList);
    }
}
