package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import model.Shop;
import java.awt.event.ActionEvent;

public abstract class CloseAndOpenEdit<T> implements ActionListener {
    private JFrame frame;
    private Shop shop;
    private T toEdit;
    JComboBox<String> comboBox;

    public CloseAndOpenEdit(JFrame f, Shop s, JComboBox<String> comboBox, T toEdit) {
        this.frame = f;
        this.shop = s;
        this.toEdit = toEdit;
        this.comboBox = comboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        open(shop, comboBox, toEdit);
    }

    public abstract void open(Shop shop, JComboBox<String> comboBox, T toEdit);
}
