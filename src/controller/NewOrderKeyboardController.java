package controller;

import model.Keyboard;
import model.OrderList;
import model.Shop;
import view.NewOrder;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewOrderKeyboardController implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JComboBox<String> comboBox;
    private JComboBox<String> numberOf;
    private JLabel totalPrice;
    private OrderList orderList;
    private JCheckBox isMechanical;
    private JCheckBox isRGB;
    private JCheckBox isWireless;
    private JCheckBox hasKeypad;

    public NewOrderKeyboardController(JComboBox<String> comboBox, JComboBox<String> numberOf,
            JLabel totalPrice2, JFrame frame, Shop shop, OrderList orderlist,
            JCheckBox isMechanical, JCheckBox isRGB, JCheckBox isWireless, JCheckBox hasKeypad) {
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
                numberOf.getSelectedIndex(), numberOf.getSelectedIndex(), isMechanical.isSelected(),
                isRGB.isSelected(), isWireless.isSelected(), hasKeypad.isSelected());
        this.orderList.addOrder(keyboard);
        frame.dispose();
        new NewOrder(shop, orderList);
    }
}
