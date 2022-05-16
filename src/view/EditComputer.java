package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.EditComputerController;
import model.Computer;
import model.Shop;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class EditComputer extends JFrame {

    private JPanel contentPane;
    private JTextField tfName;
    private JTextField tfPrice;
    private JTextField tfProc;
    private JTextField tfRam;
    private JTextField tfHdd;
    private Computer computer;

    public EditComputer(Shop shop, JComboBox<String> comboBox, Computer toEdit) {
        computer = shop.getComputerByName(comboBox.getSelectedItem().toString());

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 245, 373);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblName = new JLabel("Nom");
        lblName.setBounds(6, 6, 233, 16);
        contentPane.add(lblName);

        tfName = new JTextField(computer.getName());
        tfName.setBounds(6, 24, 233, 26);
        contentPane.add(tfName);
        tfName.setColumns(10);

        JLabel lblPrice = new JLabel("Price");
        lblPrice.setBounds(6, 54, 61, 16);
        contentPane.add(lblPrice);

        tfPrice = new JTextField(String.valueOf(computer.getPrice()));
        tfPrice.setBounds(6, 74, 233, 26);
        contentPane.add(tfPrice);
        tfPrice.setColumns(10);

        JLabel lblProc = new JLabel("Processeur");
        lblProc.setBounds(6, 110, 233, 16);
        contentPane.add(lblProc);

        tfProc = new JTextField(String.valueOf(computer.getProc()));
        tfProc.setBounds(6, 133, 233, 26);
        contentPane.add(tfProc);
        tfProc.setColumns(10);

        JLabel lblRam = new JLabel("Ram");
        lblRam.setBounds(6, 164, 233, 16);
        contentPane.add(lblRam);

        tfRam = new JTextField(String.valueOf(computer.getRamGB()));
        tfRam.setBounds(6, 181, 233, 26);
        contentPane.add(tfRam);
        tfRam.setColumns(10);

        JLabel lblHdd = new JLabel("HDD");
        lblHdd.setBounds(6, 219, 61, 16);
        contentPane.add(lblHdd);

        tfHdd = new JTextField(String.valueOf(computer.getHddGB()));
        tfHdd.setBounds(6, 237, 233, 26);
        contentPane.add(tfHdd);
        tfHdd.setColumns(10);

        JButton btnCancel = new JButton("Annuler");
        btnCancel.setBounds(6, 310, 117, 29);
        contentPane.add(btnCancel);

        JButton btnSubmit = new JButton("Valider");
        btnSubmit.setBounds(122, 310, 117, 29);
        btnSubmit.addActionListener(new EditComputerController(this, shop, comboBox, tfName,
                tfPrice, tfProc, tfRam, tfHdd));
        contentPane.add(btnSubmit);
    }

}
