package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.NewEmployeWindow;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewEmployeeWindow implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenNewEmployeeWindow(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewEmployeWindow(this.s);
    }
}
