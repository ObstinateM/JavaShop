package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.CloseAndOpenMain;
import controller.NewComputerController;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewOrderComputer extends JFrame {

    private JPanel contentPane;
    private JTextField tfName;
    private JTextField tdPrice;
    private JTextField tfInventory;
    private JTextField tfProc;
    private JTextField tfRam;
    private JTextField tfHDD;

    public NewOrderComputer(Shop shop) {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 200, 563);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
    }
}
