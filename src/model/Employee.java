package model;

import java.util.*;

public class Employee extends Person {

    private Status status;
    private int salary;
    private double timeWorked;

    public Employee(String firstName, String lastName, Date dob, int sex) {
        super(firstName, lastName, dob, sex);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(double timeWorked) {
        this.timeWorked = timeWorked;
    }
}
