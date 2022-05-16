package controller;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import model.Keyboard;
import model.Shop;
import view.EditKeyboard;

public class CloseAndOpenEditKeyboard extends CloseAndOpenEdit<Keyboard> {

    public CloseAndOpenEditKeyboard(JFrame f, Shop s, JComboBox<String> comboBox, Keyboard toEdit) {
        super(f, s, comboBox, toEdit);
    }

    @Override
    public void open(Shop shop, JComboBox<String> comboBox, Keyboard toEdit) {
        new EditKeyboard(shop, comboBox, toEdit);
    }

}
