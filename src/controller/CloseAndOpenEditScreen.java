package controller;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import model.Screen;
import model.Shop;
import view.EditScreen;

public class CloseAndOpenEditScreen extends CloseAndOpenEdit<Screen> {

    public CloseAndOpenEditScreen(JFrame f, Shop s, JComboBox<String> comboBox, Screen toEdit) {
        super(f, s, comboBox, toEdit);
    }

    @Override
    public void open(Shop shop, JComboBox<String> comboBox, Screen toEdit) {
        new EditScreen(shop, comboBox, toEdit);
    }

}
