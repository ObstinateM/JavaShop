package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import model.Screen;
import model.Shop;
import java.awt.event.ActionEvent;

public class RefreshDataShowScreen implements ActionListener {
    private Shop shop;
    private Screen screen;
    private JComboBox<String> cbName;
    private JLabel lblPrice;
    private JLabel lblInventory;
    private JLabel lblNumberOfSell;
    private JLabel lblWidth;
    private JLabel lblHeight;
    private JLabel lblResponseTime;
    private JLabel lblRefreshRate;

    public RefreshDataShowScreen(Shop shop, Screen screen, JLabel lblPrice, JLabel lblInventory,
            JLabel lblNumberOfSell, JLabel lblWidth, JLabel lblHeight, JLabel lblResponseTime,
            JLabel lblRefreshRate, JComboBox<String> cbName) {
        this.shop = shop;
        this.screen = screen;
        this.lblPrice = lblPrice;
        this.lblInventory = lblInventory;
        this.lblNumberOfSell = lblNumberOfSell;
        this.lblWidth = lblWidth;
        this.lblHeight = lblHeight;
        this.lblResponseTime = lblResponseTime;
        this.lblRefreshRate = lblRefreshRate;
        this.cbName = cbName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        screen = shop.getScreenByName(cbName.getSelectedItem().toString());
        lblPrice.setText("Prix : " + screen.getPrice() + "€");
        lblInventory.setText(screen.getInventory() + " en stocks");
        lblNumberOfSell.setText(screen.getNumberOfSell() + " vendus");
        lblWidth.setText("Width : " + screen.getWidth());
        lblHeight.setText("Height : " + screen.getHeight());
        lblResponseTime.setText("Response Time : " + screen.getResponseTime() + " ms");
        lblRefreshRate.setText("Refresh Rate : " + screen.getRefreshRate() + " ms");
    }
}
