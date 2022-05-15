package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.NewCustomer;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewCustomer implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenNewCustomer(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewCustomer(this.s);
    }
}
