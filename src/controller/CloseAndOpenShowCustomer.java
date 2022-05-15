package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.ShowCustomer;
import java.awt.event.ActionEvent;

public class CloseAndOpenShowCustomer implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenShowCustomer(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new ShowCustomer(this.s);
    }
}
