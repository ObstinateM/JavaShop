package model;

import java.util.ArrayList;

public class Shop {

    private String address;
    private String name;
    private String password;
    private ArrayList<Computer> computerList = new ArrayList<Computer>();
    private ArrayList<Keyboard> keyboardList = new ArrayList<Keyboard>();
    private ArrayList<Screen> screenList = new ArrayList<Screen>();
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public Shop(String name, String password, String address) {
        this.address = address;
        this.name = name;
        this.password = password;

        // Hard coded data
        computerList
                .add(new Computer(0, "MacBook Pro 2020", 2999.99, 19, 1, "Intel Core i7", 16, 198));
        computerList
                .add(new Computer(1, "MacBook Air 2019", 1999.99, 18, 3, "Intel Core i5", 24, 256));

        keyboardList.add(new Keyboard(0, "Logitech G518", 99.99, 17, 3, true, true, true, true));
        keyboardList.add(new Keyboard(1, "Logitech G666", 66.6, 17, 1, true, true, false, false));

        screenList.add(new Screen(0, "LG OLED 2018", 299.99, 18, 1, 15, 17, 60, 2));
        screenList.add(new Screen(1, "Samsung QLED 2017", 399.99, 17, 6, 15, 19, 144, 1));

        customerList.add(new Customer("Arthur", "Couteau", "01/01/1990", "HOMME", 20201838));
        customerList.add(new Customer("Mathis", "Beauville", "01/01/1990", "HOMME", 20200048));
        customerList.add(new Customer("Jane", "Doe", "17/01/1990", "FEMME", 27));

        employeeList.add(new Employee("John", "Doe", "01/01/1990", "HOMME", 20161866));
        employeeList.get(0).setStatus("Travaille");
        employeeList.add(new Employee("Jane", "Doe", "01/01/1990", "FEMME", 20200021));
        employeeList.get(1).setStatus("En pause");
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

    public ArrayList<Computer> getComputerList() {
        return this.computerList;
    }

    public ArrayList<Keyboard> getKeyboardList() {
        return this.keyboardList;
    }

    public ArrayList<Screen> getScreenList() {
        return this.screenList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public ArrayList<Customer> getCustomerList() {
        return this.customerList;
    }

    public String getAllArticlesAsString() {
        String result = "Ordinateurs :\n";
        for (Computer computer : computerList) {
            result += "    " + computer.getName() + " | "
                    + String.format("%.02f", computer.getPrice() * computer.getNumberOfSell())
                    + " € de profit" + " | " + computer.getInventory() + " en stocks" + "\n";
        }

        result += "\nClaviers :\n";
        for (Keyboard keyboard : keyboardList) {
            result += "    " + keyboard.getName() + " | "
                    + String.format("%.02f", keyboard.getPrice() * keyboard.getNumberOfSell())
                    + " € de profit" + " | " + keyboard.getInventory() + " en stocks" + "\n";
        }

        result += "\nEcrans :\n";
        for (Screen screen : screenList) {
            result += "    " + screen.getName() + " | "
                    + String.format("%.02f", screen.getPrice() * screen.getNumberOfSell())
                    + " € de profit" + " | " + screen.getInventory() + " en stocks" + "\n";
        }
        return result;
    }

    public String getAllEmployeeStatus() {
        String result = "";
        for (Employee e : employeeList) {
            result += "ID :" + e.getId() + " - " + e.getStatus() + "\n";
        }
        return result;
    }

    public String getAllEmployeeAsString() {
        String result = "";
        for (Employee e : employeeList) {

            result += "Prenom : " + e.getFirstName() + " Nom : " + e.getLastName() + " ID : "
                    + e.getId() + " Sexe : " + e.getSex() + " Date de naissance : " + e.getDob()
                    + " Statut : " + e.getStatus() + "\n";
        }
        return result;
    }

    public Keyboard getKeyboardByName(String name) {
        for (Keyboard keyboard : keyboardList) {
            if (keyboard.getName().equals(name)) {
                return keyboard;
            }
        }
        return null;
    }

    public Computer getComputerByName(String name) {
        for (Computer computer : computerList) {
            if (computer.getName().equals(name)) {
                return computer;
            }
        }
        return null;
    }

    public Screen getScreenByName(String name) {
        for (Screen screen : screenList) {
            if (screen.getName().equals(name)) {
                return screen;
            }
        }
        return null;
    }

    // return Employe with by lastname
    public Employee getEmployeeByFirstName(String FirstName) {

        for (Employee e : employeeList) {
            // System.out.println("Employé rentré :" + FirstName);
            // System.out.println("Employé choisis :" + e.getFirstName());
            if (e.getFirstName().equals(FirstName)) {

                return e;
            }
        }

        return null;
    }
}
