package controller;

import model.Employee;
import model.Shop;
import view.MainInterface;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SetEmployeeStatusController implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JComboBox<String> combo;
    private Employee em;
    private JTextField firstName;

    public SetEmployeeStatusController(JFrame frame, Shop s, JComboBox<String> combo,
            JTextField firstName) {
        this.frame = frame;
        this.shop = s;
        this.combo = combo;
        this.firstName = firstName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Employee emp : shop.getEmployeeList()) {
            if (emp.getFirstName().equals(firstName.getText())) {
                this.em = emp;
            }
        }
        if (em == null) {
            JOptionPane.showMessageDialog(null, "Cette employé n'existe pas", "Error",
                    JOptionPane.ERROR_MESSAGE);
            new MainInterface(shop);
            return;
        }
        int status = combo.getSelectedIndex();
        if (status == 0) {
            em.setStatus("EN PAUSE");
        } else if (status == 1) {
            em.setStatus("EN SERVICE");
        } else if (status == 2) {
            em.setStatus("A FINI");
        } else {
            em.setStatus("VIRE");
        }

        frame.dispose();
        new MainInterface(shop);
    }
}
