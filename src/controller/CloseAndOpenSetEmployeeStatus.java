package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.SetStatusForEmployee;

import java.awt.event.ActionEvent;

public class CloseAndOpenSetEmployeeStatus implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenSetEmployeeStatus(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new SetStatusForEmployee(this.s);
    }
}
