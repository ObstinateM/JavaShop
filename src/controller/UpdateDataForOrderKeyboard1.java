package controller;

import model.Shop;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class UpdateDataForOrderKeyboard1 implements ActionListener {
    private Shop shop;
    private JComboBox<String> comboBox;
    private JLabel totalPrice;

    public UpdateDataForOrderKeyboard1(JComboBox<String> comboBox, JLabel totalPrice,
            Shop shop) {
        this.totalPrice = totalPrice;
        this.shop = shop;
        this.comboBox = comboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> cb = (JComboBox<String>) e.getSource();
        String newSelection = (String) cb.getSelectedItem();
        int value = Integer.parseInt(newSelection);
        totalPrice.setText(""
                + value * shop.getKeyboardList().get(comboBox.getSelectedIndex()).getPrice() + "€");
    }

}
