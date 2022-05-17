package controller;

import model.Screen;
import model.Shop;
import utils.Regex;
import view.MainInterface;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewScreenController implements ActionListener {
    private Shop shop;
    private JFrame frame;
    private JTextField tfName;
    private JTextField tfPrice;
    private JTextField tfInventory;
    private JTextField tfWidth;
    private JTextField tfHeight;
    private JTextField tfRefreshRate;
    private JTextField tfResponseTime;

    public NewScreenController(Shop s, JFrame f, JTextField tfName, JTextField tfPrice,
            JTextField tfInventory, JTextField tfWidth, JTextField tfHeight,
            JTextField tfRefreshRate, JTextField tfResponseTime) {
        this.shop = s;
        this.frame = f;
        this.tfName = tfName;
        this.tfPrice = tfPrice;
        this.tfInventory = tfInventory;
        this.tfWidth = tfWidth;
        this.tfHeight = tfHeight;
        this.tfRefreshRate = tfRefreshRate;
        this.tfResponseTime = tfResponseTime;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tfName.getText().isEmpty() || tfPrice.getText().isEmpty()
                || tfInventory.getText().isEmpty() || tfWidth.getText().isEmpty()
                || tfHeight.getText().isEmpty() || tfRefreshRate.getText().isEmpty()
                || tfResponseTime.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateName(tfName.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un nom valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateDouble(tfPrice.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un prix valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfInventory.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un inventaire valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfWidth.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer une largeur valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfHeight.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer une hauteur valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfRefreshRate.getText())) {
            JOptionPane.showMessageDialog(null,
                    "Veuillez entrer un taux de rafraichissement valide", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Regex.validateNumber(tfResponseTime.getText())) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un temps de réponse valide",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int min = 100;
        int max = 999;
        int id = (int) Math.floor(Math.random() * (max - min + 1) + min);
        shop.getScreenList()
                .add(new Screen(id, tfName.getText(), Double.parseDouble(tfPrice.getText()),
                        Integer.parseInt(tfInventory.getText()), 0,
                        Integer.parseInt(tfWidth.getText()), Integer.parseInt(tfHeight.getText()),
                        Integer.parseInt(tfRefreshRate.getText()),
                        Integer.parseInt(tfResponseTime.getText())));
        JOptionPane.showMessageDialog(null, "Ecran ajouté");
        frame.dispose();
        new MainInterface(shop);
    }
}
