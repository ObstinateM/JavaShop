package controller;

import model.Keyboard;
import model.OrderList;
import model.Shop;
import view.NewOrder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewOrderKeyboardController implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JComboBox<String> comboBox;
    private JComboBox<String> numberOf;
    private JLabel totalPrice;
    private OrderList orderList;
    private JLabel isMechanical;
    private JLabel isRGB;
    private JLabel isWireless;
    private JLabel hasKeypad;

    public NewOrderKeyboardController(JComboBox<String> comboBox, JComboBox<String> numberOf,
            JLabel totalPrice2, JFrame frame, Shop shop, OrderList orderlist,
            JLabel isMechanical, JLabel isRGB, JLabel isWireless, JLabel hasKeypad) {
        this.comboBox = comboBox;
        this.numberOf = numberOf;
        this.totalPrice = totalPrice2;
        this.shop = shop;
        this.frame = frame;
        this.orderList = orderlist;
        this.isMechanical = isMechanical;
        this.isRGB = isRGB;
        this.isWireless = isWireless;
        this.hasKeypad = hasKeypad;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Keyboard keyboard = new Keyboard((int) (Math.random() * 900) + 100,
                comboBox.getSelectedItem().toString(),
                Double.parseDouble(totalPrice.getText().replace(" ", "").replace("€", "")),
                numberOf.getSelectedIndex() + 1, numberOf.getSelectedIndex() + 1,
                this.isMechanical.getText().split("true")[0].equals("true") ? true : false,
                this.isRGB.getText().split("true")[0].equals("true") ? true : false,
                this.isWireless.getText().split("true")[0].equals("true") ? true : false,
                this.hasKeypad.getText().split("true")[0].equals("true") ? true : false);
        this.orderList.addOrder(keyboard);
        frame.dispose();
        new NewOrder(shop, orderList);
    }
}
