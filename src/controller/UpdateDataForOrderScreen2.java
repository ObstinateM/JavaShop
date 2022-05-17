package controller;

import model.Shop;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class UpdateDataForOrderScreen2 implements ActionListener {
        private Shop shop;
        private JComboBox<String> comboBoxNumber;
        private JComboBox<String> comboBox;
        private JLabel totalPrice;
        private JLabel unityPrice;
        private JLabel width;
        private JLabel height;
        private JLabel refreshRate;
        private JLabel responseTime;

        public UpdateDataForOrderScreen2(JComboBox<String> comboBox, JComboBox<String> comboBoxNumber,
                        JLabel totalPrice,
                        JLabel lblUnityPrice, Shop shop,
                        JLabel width, JLabel height, JLabel refreshRate, JLabel responseTime) {
                this.totalPrice = totalPrice;
                this.unityPrice = lblUnityPrice;
                this.shop = shop;
                this.comboBox = comboBox;
                this.comboBoxNumber = comboBoxNumber;
                this.width = width;
                this.height = height;
                this.refreshRate = refreshRate;
                this.responseTime = responseTime;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                // get int from combo box

                JComboBox<String> cb = (JComboBox<String>) e.getSource();
                totalPrice.setText(""
                                + (comboBoxNumber.getSelectedIndex() + 1)
                                                * shop.getScreenList().get(comboBox.getSelectedIndex())
                                                                .getPrice()
                                + "€");
                unityPrice.setText("Prix par article : "
                                + shop.getScreenList().get(cb.getSelectedIndex()).getPrice() + "€");
                width.setText("Largeur : " + shop.getScreenList().get(cb.getSelectedIndex()).getWidth() + " cm");
                height.setText("Hauteur : " + shop.getScreenList().get(cb.getSelectedIndex()).getHeight() + " cm");
                refreshRate.setText("Hz : " + shop.getScreenList().get(cb.getSelectedIndex()).getRefreshRate() + " hz");
                responseTime.setText("Temps de réponse : "
                                + shop.getScreenList().get(cb.getSelectedIndex()).getResponseTime() + " ms");

        }

}
