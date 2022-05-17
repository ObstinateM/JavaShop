package controller;

import model.Computer;
import model.OrderList;
import model.Shop;
import view.NewOrder;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewOrderComputerController implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JComboBox<String> comboBox;
    private JComboBox<String> numberOf;
    private JLabel totalPrice;
    private OrderList orderList;
    private JLabel proc;
    private JLabel ram;
    private JLabel hdd;

    public NewOrderComputerController(JComboBox<String> comboBox, JComboBox<String> numberOf,
            JLabel totalPrice2, JFrame frame, Shop shop, OrderList orderlist, JLabel proc,
            JLabel ram, JLabel hdd) {
        this.comboBox = comboBox;
        this.numberOf = numberOf;
        this.totalPrice = totalPrice2;
        this.shop = shop;
        this.frame = frame;
        this.orderList = orderlist;
        this.proc = proc;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Computer computer = new Computer((int) (Math.random() * 900) + 100,
                comboBox.getSelectedItem().toString(),
                Double.parseDouble(totalPrice.getText().replace(" ", "").replace("€", "")),
                numberOf.getSelectedIndex() + 1, numberOf.getSelectedIndex() + 1, proc.getText(),
                Integer.parseInt(this.ram.getText()), Integer.parseInt(this.hdd.getText()));

        this.orderList.addOrder(computer);
        frame.dispose();
        new NewOrder(shop, orderList);

    }
}
