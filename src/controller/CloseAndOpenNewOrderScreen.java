package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.NewOrderScreen;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewOrderScreen implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenNewOrderScreen(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewOrderScreen(this.s);
    }
}
