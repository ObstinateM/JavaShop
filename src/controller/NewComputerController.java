package controller;

import model.Computer;
import model.Shop;
import view.MainInterface;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import utils.Regex;

public class NewComputerController implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JTextField tfName;
    private JTextField tdPrice;
    private JTextField tfInventory;
    private JTextField tfProc;
    private JTextField tfRam;
    private JTextField tfHDD;

    public NewComputerController(Shop s, JFrame f, JTextField tfName, JTextField tdPrice,
            JTextField tfInventory, JTextField tfProc, JTextField tfRam, JTextField tfHDD) {
        this.shop = s;
        this.frame = f;
        this.tfName = tfName;
        this.tdPrice = tdPrice;
        this.tfInventory = tfInventory;
        this.tfProc = tfProc;
        this.tfRam = tfRam;
        this.tfHDD = tfHDD;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tfName.getText().isEmpty() || tdPrice.getText().isEmpty()
                || tfInventory.getText().isEmpty() || tfProc.getText().isEmpty()
                || tfRam.getText().isEmpty() || tfHDD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateName(tfName.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un nom valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateDouble(tdPrice.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un prix valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfInventory.getText())) {
            JOptionPane.showMessageDialog(null,
                    "Veuillez entrer un nombre valide pour l'inventaire", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateLettersAndNumbers(tfProc.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un processeur valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfRam.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer une ram valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfHDD.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un hdd valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int min = 100;
        int max = 999;
        int id = (int) Math.floor(Math.random() * (max - min + 1) + min);
        shop.getComputerList()
                .add(new Computer(id, tfName.getText(), Double.parseDouble(tdPrice.getText()),
                        Integer.parseInt(tfInventory.getText()), 0, tfProc.getText(),
                        Integer.parseInt(tfRam.getText()), Integer.parseInt(tfHDD.getText())));
        JOptionPane.showMessageDialog(null, "Ordinateur ajouté");
        frame.dispose();
        new MainInterface(shop);
    }
}
