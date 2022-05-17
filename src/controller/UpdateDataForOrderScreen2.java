package controller;

import view.*;
import model.Screen;
import model.Shop;
import view.MainInterface;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdateDataForOrderScreen2 implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JComboBox numberOf;
    private JComboBox comboBox;
    private JTextField orderName;
    private JLabel totalPrice;

    public UpdateDataForOrderScreen2(JComboBox numberOf, JComboBox<String> comboBox, JLabel totalPrice, JFrame frame,
            Shop shop) {
        this.numberOf = numberOf;
        this.orderName = orderName;
        this.totalPrice = totalPrice;
        this.shop = shop;
        this.frame = frame;
        this.comboBox = comboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> cb = (JComboBox<String>) e.getSource();
        String newSelection = (String) cb.getSelectedItem();
        int value = Integer.parseInt(newSelection);
        totalPrice.setText(""
                + value * shop.getScreenList().get(comboBox.getSelectedIndex()).getPrice() + "€");
    }

}
