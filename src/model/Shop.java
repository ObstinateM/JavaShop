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
    private ArrayList<Order> orderList = new ArrayList<Order>();

    public Shop(String name, String password, String address) {
        this.address = address;
        this.name = name;
        this.password = password;

        // Hard coded data
        computerList.add(new Computer(0, "MacBook Pro", 2999.99, 10, 0, "Intel Core i7", 16, 512));
        computerList.add(new Computer(1, "MacBook Air", 1999.99, 10, 0, "Intel Core i5", 8, 256));

        keyboardList.add(new Keyboard(0, "Logitech G502", 99.99, 10, 0, true, true, true, true));
        keyboardList.add(new Keyboard(1, "Logitech G666", 66.6, 10, 0, true, true, false, false));

        screenList.add(new Screen(0, "LG OLED", 299.99, 10, 0, 15, 17, 60, 1));
        screenList.add(new Screen(1, "Samsung OLED", 399.99, 10, 0, 15, 19, 144, 5));
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

    public ArrayList<Order> getOrderList() {
        return this.orderList;
    }

    public String getAllArticlesAsString() {
        String result = "Ordinateurs :\n";
        for (Computer computer : computerList) {
            result += "    " + computer.getName() + "\n";
        }

        result += "\nClaviers :\n";
        for (Keyboard keyboard : keyboardList) {
            result += "    " + keyboard.getName() + "\n";
        }

        result += "\nEcrans :\n";
        for (Screen screen : screenList) {
            result += "    " + screen.getName() + "\n";
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
                    + e.getId() + " Sexe : " + e.getSex() + " Date de naissance : " + e.getDob() + " Statut : "
                    + e.getStatus() + "\n";
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

    // methode for Order
    public String getAllOrdersAsString() {
        String result = "";
        for (Order o : orderList) {
            // get all article in Order
            for (Article a : o.getArticlesList()) {
                result += "Name :" + o.getOrderName() + " - " + o.getId() + " :\n" + "    " + a.getName() + " - "
                        + a.getPrice() + "€ - " + o.getQuantity() + "\n";

            }

        }
        return result;

    }
}
