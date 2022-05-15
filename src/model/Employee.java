package model;

public class Employee extends Person {

    private String status = "A DEFINIR";

    public Employee(String firstName, String lastName, String dob, String sex, int id) {
        super(firstName, lastName, dob, sex, id);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

}
