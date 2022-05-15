package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.CloseAndOpenMain;
import controller.NewComputerController;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.sound.midi.Synthesizer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;

public class NewOrderComputer extends JFrame implements ItemListener {

    private JPanel contentPane;
    private JTextField idClient;
    private JTextField orderName;
    private JTextField number;
    private JComboBox comboBox;

    public NewOrderComputer(Shop shop) {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 500, 300, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        // textField
        JLabel lblIdClient = new JLabel("ID Client :");
        lblIdClient.setBounds(6, 30, 61, 16);
        contentPane.add(lblIdClient);
        idClient = new JTextField();
        idClient.setBounds(6, 50, 200, 22);
        contentPane.add(idClient);
        idClient.setColumns(10);
        // textField
        JLabel lblOrderName = new JLabel("Nom de la commande :");
        lblOrderName.setBounds(6, 70, 200, 16);
        contentPane.add(lblOrderName);
        orderName = new JTextField();
        orderName.setBounds(6, 90, 200, 22);
        contentPane.add(orderName);
        orderName.setColumns(10);
        // textField
        JLabel lblNumber = new JLabel("Nombre :");
        lblNumber.setBounds(6, 110, 61, 16);
        contentPane.add(lblNumber);
        number = new JTextField();
        number.setBounds(6, 130, 200, 22);
        contentPane.add(number);
        number.setColumns(10);
        // comboBox
        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setBounds(0, 0, 200, 30);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        for (int i = 0; i < shop.getComputerList().size(); i++) {
            model.addElement(shop.getComputerList().get(i).getName());
        }
        comboBox.setModel(model);
        contentPane.add(comboBox);
        comboBox.doLayout();
        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent arg0) {
                // Do Something
                JComboBox<String> cb = (JComboBox<String>) arg0.getSource();
                String newSelection = (String) cb.getSelectedItem();

                // Display the computer selected

            }
        });

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub

    }

}
