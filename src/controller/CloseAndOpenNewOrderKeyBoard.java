package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.NewOrderKeyBoard;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewOrderKeyBoard implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenNewOrderKeyBoard(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewOrderKeyBoard(this.s);
    }
}
