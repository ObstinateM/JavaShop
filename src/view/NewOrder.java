package view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import model.OrderList;
import controller.CloseAndOpenMain;
import controller.CloseAndOpenMainWithNewOrder;
import controller.CloseAndOpenNewOrderComputer;
import controller.CloseAndOpenNewOrderKeyboard;
import controller.CloseAndOpenNewOrderScreen;
import model.Shop;

public class NewOrder extends JFrame {
    private JPanel contentPane;

    public NewOrder(Shop shop, OrderList orderlist) {
        setTitle("Nouvelle Commande");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 300, 700, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblArticleType = new JLabel("Quel type d'article voulez vous commander ?");
        lblArticleType.setBounds(10, 10, 260, 16);
        contentPane.add(lblArticleType);

        JButton btnAddComputer = new JButton("Ordinateurs");
        btnAddComputer.setBounds(100, 80, 117, 30);
        btnAddComputer.addActionListener(new CloseAndOpenNewOrderComputer(this, shop, orderlist));
        contentPane.add(btnAddComputer);

        JButton btnAddScreen = new JButton("Ecrans");
        btnAddScreen.setBounds(100, 180, 117, 30);
        btnAddScreen.addActionListener(new CloseAndOpenNewOrderScreen(this, shop, orderlist));
        contentPane.add(btnAddScreen);

        JButton btnAddKeyboard = new JButton("Claviers");
        btnAddKeyboard.setBounds(100, 280, 117, 30);
        btnAddKeyboard.addActionListener(new CloseAndOpenNewOrderKeyboard(this, shop, orderlist));
        contentPane.add(btnAddKeyboard);

        JLabel lblListArticle = new JLabel("Liste des articles commandé");
        lblListArticle.setBounds(300, 50, 200, 16);
        contentPane.add(lblListArticle);

        JTextPane textAreaEmployee = new JTextPane();
        textAreaEmployee.setEditable(false);
        textAreaEmployee.setText(shop.getAllOrderAsString(orderlist));
        textAreaEmployee.setBounds(300, 80, 350, 350);
        contentPane.add(textAreaEmployee);

        JButton btnValidate = new JButton("Valider");
        btnValidate.setBounds(63, 400, 100, 25);
        btnValidate.setBackground(Color.decode("#AAFF00"));
        btnValidate.addActionListener(new CloseAndOpenMainWithNewOrder(this, shop, orderlist));
        contentPane.add(btnValidate);

        JButton btnCancel = new JButton("Annuler");
        btnCancel.setBounds(63, 450, 100, 25);
        btnCancel.setBackground(Color.decode("#C70039"));
        contentPane.add(btnCancel);
        btnCancel.addActionListener(new CloseAndOpenMain(this, shop));
    }
}
