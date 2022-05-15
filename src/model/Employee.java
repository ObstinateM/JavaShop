package model;

import java.time.LocalDate;
import java.util.*;

public class Employee extends Person {

    private String status = "A DEFINIR";
    private int id;

    public Employee(String firstName, String lastName, String dob, String sex, int id) {
        super(firstName, lastName, dob, sex);
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

}
