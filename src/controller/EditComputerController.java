package controller;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Computer;
import model.Shop;
import utils.Regex;
import view.MainInterface;
import java.awt.event.ActionEvent;

public class EditComputerController implements ActionListener {
    private Computer computer;
    private Shop shop;
    private JFrame frame;
    private JTextField tfName;
    private JTextField tfPrice;
    private JTextField tfProc;
    private JTextField tfRam;
    private JTextField tfHdd;

    public EditComputerController(JFrame frame, Shop shop, JComboBox<String> comboBox,
            JTextField tfName, JTextField tfPrice, JTextField tfProc, JTextField tfRam,
            JTextField tfHdd) {
        this.computer = shop.getComputerByName(comboBox.getSelectedItem().toString());
        this.frame = frame;
        this.shop = shop;
        this.tfName = tfName;
        this.tfPrice = tfPrice;
        this.tfProc = tfProc;
        this.tfRam = tfRam;
        this.tfHdd = tfHdd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tfName.getText().isEmpty() || tfPrice.getText().isEmpty() || tfProc.getText().isEmpty()
                || tfRam.getText().isEmpty() || tfHdd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateLettersAndNumbers(tfName.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un nom valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfPrice.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un prix valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfProc.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un processeur valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfRam.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer une ram valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfHdd.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un hdd valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            computer.setName(tfName.getText());
            computer.setPrice(Double.parseDouble(tfPrice.getText()));
            computer.setProc(tfProc.getText());
            computer.setRamGB(Integer.parseInt(tfRam.getText()));
            computer.setHddGB(Integer.parseInt(tfHdd.getText()));
        } catch (Exception err) {
            System.out.println(err.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur de type");
        }
        frame.dispose();
        new MainInterface(shop);
    }
}
