package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.ShowComputer;
import java.awt.event.ActionEvent;

public class CloseAndOpenShowComputer implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenShowComputer(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new ShowComputer(this.s);
    }
}
