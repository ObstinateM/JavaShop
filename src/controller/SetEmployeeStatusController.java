package controller;

import model.Computer;
import model.Employee;
import model.Shop;
import view.MainInterface;
import view.SetStatusForEmployee;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.ObjectInputFilter.Status;
import java.awt.event.ActionEvent;

public class SetEmployeeStatusController implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JComboBox combo;
    private Employee em;

    public SetEmployeeStatusController(Shop s, JComboBox combo, JTextField firstName) {
        this.shop = s;
        // this.frame = f;
        this.combo = combo;
        if (firstName.getText() != null) {
            this.em = s.getEmployeeByFirstName(firstName.getText());

            int status = combo.getSelectedIndex();
            if (status == 0) {
                em.setStatus("EN PAUSE");
            } else if (status == 1) {
                em.setStatus("EN SERVICE");
            } else if (status == 2) {
                em.setStatus("A FINIS");
            } else {
                em.setStatus("VIRE");
            }
            System.out.print(em.getStatus());
            // close window

            // frame.dispose();
            new MainInterface(shop);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // get Status of comboBox

    }
}
