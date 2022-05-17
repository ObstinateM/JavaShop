package controller;

import view.*;
import model.Computer;
import model.Shop;
import view.MainInterface;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdateDataForOrderComputer2 implements ActionListener {
        private Shop shop;
        private JFrame frame;
        private JComboBox numberOf;
        private JComboBox comboBox;
        private JTextField orderName;
        private JLabel totalPrice;
        private JLabel unityPrice;

        public UpdateDataForOrderComputer2(JComboBox numberOf, JComboBox<String> comboBox,
                        JLabel totalPrice, JLabel unityPrice,
                        JFrame frame, Shop shop) {
                this.numberOf = numberOf;
                this.orderName = orderName;
                this.totalPrice = totalPrice;
                this.unityPrice = unityPrice;
                this.shop = shop;
                this.frame = frame;
                this.comboBox = comboBox;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox<String>) e.getSource();

                totalPrice.setText(""
                                + (numberOf.getSelectedIndex() + 1)
                                                * shop.getComputerList().get(comboBox.getSelectedIndex()).getPrice()
                                + "€");
                unityPrice.setText(
                                "Prix par article : " +
                                                shop.getComputerList().get(cb.getSelectedIndex()).getPrice() + "€");

        }

}
