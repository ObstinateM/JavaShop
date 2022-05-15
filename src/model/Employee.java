package model;

public class Employee extends Person {

    private String status = "A DEFINIR";
    private int id;

    public Employee(String firstName, String lastName, String dob, int sex, int id) {
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
