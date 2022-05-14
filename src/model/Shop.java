package model;

public class Shop {

    public String address;
    public String name;
    public String password;

    public Shop(String name, String password, String address) {
        this.address = address;
        this.name = name;
        this.password = password;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addEmployee(Employee employee) {
    }
}