package controller;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import model.Computer;
import model.Shop;
import view.EditComputer;

public class CloseAndOpenEditComputer extends CloseAndOpenEdit<Computer> {

    public CloseAndOpenEditComputer(JFrame f, Shop s, JComboBox<String> comboBox, Computer toEdit) {
        super(f, s, comboBox, toEdit);
    }

    @Override
    public void open(Shop shop, JComboBox<String> comboBox, Computer toEdit) {
        new EditComputer(shop, comboBox, toEdit);
    }

}
