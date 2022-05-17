package controller;

import model.Shop;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class UpdateDataForOrderComputer2 implements ActionListener {
        private Shop shop;
        private JComboBox<String> numberOf;
        private JComboBox<String> comboBox;
        private JLabel totalPrice;
        private JLabel unityPrice;

        public UpdateDataForOrderComputer2(JComboBox<String> numberOf, JComboBox<String> comboBox,
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

                totalPrice.setText("" + (numberOf.getSelectedIndex() + 1)
                                * shop.getComputerList().get(comboBox.getSelectedIndex()).getPrice()
                                + "€");
                unityPrice.setText("Prix par article : "
                                + shop.getComputerList().get(cb.getSelectedIndex()).getPrice()
                                + "€");

        }

}
