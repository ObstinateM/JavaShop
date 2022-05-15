package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import model.Computer;
import model.Shop;
import java.awt.event.ActionEvent;

public class RefreshDataShowComputer implements ActionListener {
    private Shop shop;
    private Computer computer;
    private JComboBox<String> cbName;
    private JLabel lblNumberOfSell;
    private JLabel lblInventory;
    private JLabel lblPrice;
    private JLabel lblProc;
    private JLabel lblRam;
    private JLabel lblHDD;

    public RefreshDataShowComputer(Shop shop, Computer computer, JLabel lblPrice,
            JLabel lblInventory, JLabel lblNumberOfSell, JLabel lblProc, JLabel lblHDD,
            JLabel lblRam, JComboBox<String> cbName) {
        this.shop = shop;
        this.computer = computer;
        this.lblPrice = lblPrice;
        this.lblInventory = lblInventory;
        this.lblNumberOfSell = lblNumberOfSell;
        this.lblProc = lblProc;
        this.lblRam = lblRam;
        this.lblHDD = lblHDD;
        this.cbName = cbName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        computer = shop.getComputerByName(cbName.getSelectedItem().toString());
        lblPrice.setText("Prix : " + computer.getPrice() + "$");
        lblInventory.setText(computer.getInventory() + " en stocks");
        lblNumberOfSell.setText(computer.getNumberOfSell() + " vendus");
        lblProc.setText("Processeur : " + computer.getProc());
        lblRam.setText("Ram : " + computer.getRamGB() + " GB");
        lblHDD.setText("HDD : " + computer.getHddGB() + " GB");
    }
}
