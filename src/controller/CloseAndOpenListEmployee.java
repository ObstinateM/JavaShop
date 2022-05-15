package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Shop;
import view.ListEmployeeWindow;
import view.NewComputer;
import java.awt.event.ActionEvent;

public class CloseAndOpenListEmployee implements ActionListener {
    private JFrame frame;
    private Shop s;

    public CloseAndOpenListEmployee(JFrame f, Shop s) {
        this.frame = f;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new ListEmployeeWindow(this.s);
    }
}
