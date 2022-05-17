package controller;

import model.OrderList;
import model.Screen;
import model.Shop;
import view.NewOrder;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewOrderScreenController implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JComboBox<String> comboBox;
    private JComboBox<String> numberOf;
    private JLabel totalPrice;
    private OrderList orderList;
    private JLabel width;
    private JLabel height;
    private JLabel refreshRate;
    private JLabel responeTime;

    public NewOrderScreenController(JComboBox<String> comboBox, JComboBox<String> numberOf,
            JLabel totalPrice2, JFrame frame, Shop shop, OrderList orderlist, JLabel width,
            JLabel height, JLabel resfreshRate, JLabel responseTime) {
        this.comboBox = comboBox;
        this.numberOf = numberOf;
        this.totalPrice = totalPrice2;
        this.shop = shop;
        this.frame = frame;
        this.orderList = orderlist;
        this.width = width;
        this.height = height;
        this.refreshRate = resfreshRate;
        this.responeTime = responseTime;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Screen keyboard = new Screen((int) (Math.random() * 900) + 100,
                comboBox.getSelectedItem().toString(),
                Double.parseDouble(totalPrice.getText().replace(" ", "").replace("€", "")),
                numberOf.getSelectedIndex(), numberOf.getSelectedIndex(),
                Integer.parseInt(this.width.getText().split(" ")[2]),
                Integer.parseInt(this.height.getText().split(" ")[2]),
                Integer.parseInt(this.refreshRate.getText().split(" ")[2]),
                Integer.parseInt(this.responeTime.getText().split(" ")[4]));

        this.orderList.addOrder(keyboard);
        frame.dispose();
        new NewOrder(shop, orderList);
    }
}
