package controller;

import javax.swing.*;
import model.*;

public class NewEmployee {

    Employee employee;

    public NewEmployee(JTextField tfFirstName, JTextField tfLastName, JTextField dob,
            JTextField sex) {

        if (tfFirstName.getText().isEmpty() || tfLastName.getText().isEmpty()
                || dob.getText().isEmpty() || sex.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please fill all the fields");
        } else {
            int sexNumber = sex.getText().equals("Homme") ? 1 : 2;

            employee = new Employee(tfFirstName.getText(), tfLastName.getText(), dob.getText(),
                    sexNumber);

        }
    }

    public Employee getEmployee() {
        return employee;
    }

}
