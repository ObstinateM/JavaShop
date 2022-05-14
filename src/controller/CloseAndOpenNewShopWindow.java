package controller;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import view.NewShopWindow;
import java.awt.event.ActionEvent;

public class CloseAndOpenNewShopWindow implements ActionListener {
    private JFrame frame;

    public CloseAndOpenNewShopWindow(JFrame f) {
        this.frame = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new NewShopWindow();
    }
}
