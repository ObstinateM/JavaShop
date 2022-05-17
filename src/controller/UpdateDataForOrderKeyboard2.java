package controller;

import model.Shop;

import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class UpdateDataForOrderKeyboard2 implements ActionListener {
        private Shop shop;
        private JComboBox<Integer> numberOf;
        private JComboBox<String> comboBox;
        private JLabel totalPrice;
        private JLabel unityPrice;

        public UpdateDataForOrderKeyboard2(JComboBox<Integer> numberOf, JComboBox<String> comboBox,
                        JLabel totalPrice, JLabel unityPrice, Shop shop) {
                this.numberOf = numberOf;
                this.totalPrice = totalPrice;
                this.unityPrice = unityPrice;
                this.shop = shop;
                this.comboBox = comboBox;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox<String>) e.getSource();

                totalPrice.setText(""
                                + (numberOf.getSelectedIndex() + 1)
                                                * shop.getKeyboardList().get(comboBox.getSelectedIndex()).getPrice()
                                + "€");
                unityPrice.setText(
                                "Prix par article : " +
                                                shop.getKeyboardList().get(cb.getSelectedIndex()).getPrice() + "€");

        }

}
