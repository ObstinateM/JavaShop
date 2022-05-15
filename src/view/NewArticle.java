package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CloseAndOpenNewComputer;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import controller.*;

public class NewArticle extends JFrame {
    private JPanel contentPane;

    public NewArticle(Shop s) {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 500, 453, 215);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblArticleType = new JLabel("Quel type d'article voulez vous ajouter ?");
        lblArticleType.setBounds(101, 38, 260, 16);
        contentPane.add(lblArticleType);

        JButton btnAddComputer = new JButton("Ordinateurs");
        btnAddComputer.setBounds(17, 96, 117, 29);
        btnAddComputer.addActionListener(new CloseAndOpenNewComputer(this, s));
        contentPane.add(btnAddComputer);

        JButton btnAddScreen = new JButton("Ecrans");
        btnAddScreen.setBounds(167, 96, 117, 29);
        contentPane.add(btnAddScreen);

        JButton btnAddKeyboard = new JButton("Claviers");
        btnAddKeyboard.setBounds(311, 96, 117, 29);
        contentPane.add(btnAddKeyboard);

        // Back au menu principal
        JButton btnBack = new JButton("Retour");
        btnBack.setBounds(167, 146, 117, 27);
        btnBack.setBackground(Color.decode("#C70039"));
        btnBack.addActionListener(new CloseAndOpenMainInterface(s, this));
        contentPane.add(btnBack);
    }
}
