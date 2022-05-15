package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.NewOrderComputer;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewOrderComputer implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenNewOrderComputer(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewOrderComputer(this.s);
    }
}
