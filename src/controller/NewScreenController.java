package controller;

import model.Screen;
import model.Shop;
import view.MainInterface;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewScreenController implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JTextField tfName;
    private JTextField tfPrice;
    private JTextField tfInventory;
    private JTextField tfWidth;
    private JTextField tfHeight;
    private JTextField tfRefreshRate;
    private JTextField tfResponseTime;

    public NewScreenController(Shop s, JFrame f, JTextField tfName, JTextField tfPrice,
            JTextField tfInventory, JTextField tfWidth, JTextField tfHeight,
            JTextField tfRefreshRate, JTextField tfResponseTime) {
        this.shop = s;
        this.frame = f;
        this.tfName = tfName;
        this.tfPrice = tfPrice;
        this.tfInventory = tfInventory;
        this.tfWidth = tfWidth;
        this.tfHeight = tfHeight;
        this.tfRefreshRate = tfRefreshRate;
        this.tfResponseTime = tfResponseTime;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tfName.getText().isEmpty() || tfPrice.getText().isEmpty()
                || tfInventory.getText().isEmpty() || tfWidth.getText().isEmpty()
                || tfHeight.getText().isEmpty() || tfRefreshRate.getText().isEmpty()
                || tfResponseTime.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Empty fied",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int min = 100;
            int max = 999;
            int id = (int) Math.floor(Math.random() * (max - min + 1) + min);
            shop.getScreenList().add(new Screen(id, tfName.getText(),
                    Double.parseDouble(tfPrice.getText()), Integer.parseInt(tfInventory.getText()),
                    0, Integer.parseInt(tfWidth.getText()), Integer.parseInt(tfHeight.getText()),
                    Integer.parseInt(tfRefreshRate.getText()),
                    Integer.parseInt(tfResponseTime.getText())));
            frame.dispose();
            new MainInterface(shop);
        }
    }
}
