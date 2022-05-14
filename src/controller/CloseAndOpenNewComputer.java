package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.NewComputer;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewComputer implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenNewComputer(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewComputer(this.s);
    }
}
