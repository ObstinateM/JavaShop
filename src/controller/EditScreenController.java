package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Screen;
import model.Shop;
import view.MainInterface;
import java.awt.event.ActionEvent;

public class EditScreenController implements ActionListener {
    private Screen screen;
    private JTextField tfName;
    private JTextField tfPrice;
    private JTextField tfHeight;
    private JTextField tfWidth;
    private JTextField tfRefreshRate;
    private JTextField tfResponseTime;
    private Shop shop;
    private JFrame frame;

    public EditScreenController(JFrame frame, Shop shop, JComboBox<String> comboBox,
            JTextField tfName, JTextField tfPrice, JTextField tfHeight, JTextField tfWidth,
            JTextField tfRefreshRate, JTextField tfResponseTime) {
        this.screen = shop.getScreenByName(comboBox.getSelectedItem().toString());
        this.tfName = tfName;
        this.tfPrice = tfPrice;
        this.tfHeight = tfHeight;
        this.tfWidth = tfWidth;
        this.tfRefreshRate = tfRefreshRate;
        this.tfResponseTime = tfResponseTime;
        this.shop = shop;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            screen.setName(tfName.getText());
            screen.setPrice(Double.parseDouble(tfPrice.getText()));
            screen.setHeight(Integer.parseInt(tfHeight.getText()));
            screen.setWidth(Integer.parseInt(tfWidth.getText()));
            screen.setRefreshRate(Integer.parseInt(tfRefreshRate.getText()));
            screen.setResponseTime(Integer.parseInt(tfResponseTime.getText()));
        } catch (Exception err) {
            System.out.println(err.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur de type");
        }
        frame.dispose();
        new MainInterface(shop);
    }
}