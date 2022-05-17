package controller;

import model.Shop;

import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class UpdateDataForOrderKeyboard2 implements ActionListener {
        private Shop shop;
        private JComboBox<String> numberOf;
        private JComboBox<String> comboBox;
        private JLabel totalPrice;
        private JLabel unityPrice;
        private JLabel isMechanical;
        private JLabel isRGB;
        private JLabel isWireless;
        private JLabel hasKeypad;

        public UpdateDataForOrderKeyboard2(JComboBox<String> numberOf, JComboBox<String> comboBox,
                        JLabel totalPrice, JLabel unityPrice, Shop shop, JLabel isMechanical, JLabel isRGB,
                        JLabel isWireless, JLabel hasKeypad) {
                this.numberOf = numberOf;
                this.totalPrice = totalPrice;
                this.unityPrice = unityPrice;
                this.shop = shop;
                this.comboBox = comboBox;
                this.isMechanical = isMechanical;
                this.isRGB = isRGB;
                this.isWireless = isWireless;
                this.hasKeypad = hasKeypad;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox<String>) e.getSource();

                totalPrice.setText("" + (numberOf.getSelectedIndex() + 1)
                                * shop.getKeyboardList().get(comboBox.getSelectedIndex()).getPrice()
                                + "€");
                unityPrice.setText("Prix par article : "
                                + shop.getKeyboardList().get(cb.getSelectedIndex()).getPrice()
                                + "€");
                // update boolean
                isMechanical.setText("Mecanique : " + shop.getKeyboardList().get(cb.getSelectedIndex()).isMechanical());
                isRGB.setText("RGB : " + shop.getKeyboardList().get(cb.getSelectedIndex()).isRGB());
                isWireless.setText("Wireless : " + shop.getKeyboardList().get(cb.getSelectedIndex()).isWireless());
                hasKeypad.setText("Keypad : " + shop.getKeyboardList().get(cb.getSelectedIndex()).hasKeypad());

        }

}
