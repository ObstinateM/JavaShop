package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import controller.CloseAndOpenNewComputer;
import controller.CloseAndOpenNewKeyboard;
import controller.CloseAndOpenNewScreen;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import controller.*;

public class NewOrder extends JFrame {
    private JPanel contentPane;

    public NewOrder(Shop s) {
        setTitle("Nouvelle Commande");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 300, 700, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblArticleType = new JLabel("Quel type d'article voulez vous commander ?");
        lblArticleType.setBounds(10, 10, 260, 16);
        contentPane.add(lblArticleType);

        JButton btnAddComputer = new JButton("Ordinateurs");
        btnAddComputer.setBounds(100, 80, 117, 30);
        btnAddComputer.addActionListener(new CloseAndOpenNewComputer(this, s));
        contentPane.add(btnAddComputer);

        JButton btnAddScreen = new JButton("Ecrans");
        btnAddScreen.setBounds(100, 180, 117, 30);
        btnAddScreen.addActionListener(new CloseAndOpenNewScreen(this, s));
        contentPane.add(btnAddScreen);

        JButton btnAddKeyboard = new JButton("Claviers");
        btnAddKeyboard.setBounds(100, 280, 117, 30);
        btnAddKeyboard.addActionListener(new CloseAndOpenNewKeyboard(this, s));
        contentPane.add(btnAddKeyboard);
        // label for list artcle order
        JLabel lblListArticle = new JLabel("Liste des articles commandé");
        lblListArticle.setBounds(300, 50, 200, 16);
        contentPane.add(lblListArticle);

        // list of articles to order
        JTextPane textAreaEmployee = new JTextPane();
        textAreaEmployee.setEditable(false);
        textAreaEmployee.setText(s.getAllOrdersAsString());
        textAreaEmployee.setBounds(300, 80, 350, 350);
        contentPane.add(textAreaEmployee);
        // Back au menu principal
        JButton btnBack = new JButton("Retour");
        btnBack.setBounds(20, 400, 80, 25);
        btnBack.setBackground(Color.decode("#C70039"));
        btnBack.addActionListener(new CloseAndOpenMain(this, s));
        contentPane.add(btnBack);
    }
}
