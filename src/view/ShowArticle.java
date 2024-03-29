package view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.CloseAndOpenMain;
import controller.CloseAndOpenShowComputer;
import controller.CloseAndOpenShowKeyboard;
import controller.CloseAndOpenShowScreen;
import model.Shop;

public class ShowArticle extends JFrame {
    private JPanel contentPane;

    public ShowArticle(Shop s) {
        setTitle("Article");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 453, 215);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblArticleType = new JLabel("Quel type d'article voulez vous voir ?");
        lblArticleType.setBounds(101, 38, 260, 16);
        contentPane.add(lblArticleType);

        JButton btnAddComputer = new JButton("Ordinateurs");
        btnAddComputer.setBounds(17, 96, 117, 29);
        btnAddComputer.addActionListener(new CloseAndOpenShowComputer(this, s));
        contentPane.add(btnAddComputer);

        JButton btnAddScreen = new JButton("Ecrans");
        btnAddScreen.setBounds(167, 96, 117, 29);
        btnAddScreen.addActionListener(new CloseAndOpenShowScreen(this, s));
        contentPane.add(btnAddScreen);

        JButton btnAddKeyboard = new JButton("Claviers");
        btnAddKeyboard.setBounds(311, 96, 117, 29);
        btnAddKeyboard.addActionListener(new CloseAndOpenShowKeyboard(this, s));
        contentPane.add(btnAddKeyboard);

        JButton btnBack = new JButton("Retour");
        btnBack.setBounds(167, 146, 117, 27);
        btnBack.setBackground(Color.decode("#C70039"));
        btnBack.addActionListener(new CloseAndOpenMain(this, s));
        contentPane.add(btnBack);
    }
}
