package model;

import java.util.ArrayList;

public class OrderList {
    private int idClient;
    private ArrayList<Article> orderList;

    public OrderList() {
        orderList = new ArrayList<Article>();
    }

    public void addOrder(Article order) {
        orderList.add(order);
    }

    public ArrayList<Article> getOrderList() {
        return orderList;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setCustomerId(int value) {
        this.idClient = value;
    }

    public int getIdClient() {
        return idClient;
    }

    public ArrayList<Computer> getComputerList() {
        ArrayList<Computer> computerList = new ArrayList<Computer>();
        for (Article order : orderList) {
            if (order instanceof Computer) {
                computerList.add((Computer) order);

            }

        }
        return computerList;
    }

    public ArrayList<Keyboard> getKeyboardList() {
        ArrayList<Keyboard> keyboardList = new ArrayList<Keyboard>();
        for (Article order : orderList) {
            if (order instanceof Keyboard) {
                keyboardList.add((Keyboard) order);
            }
        }
        return keyboardList;
    }

    public ArrayList<Screen> getScreenList() {
        ArrayList<Screen> screenList = new ArrayList<Screen>();
        for (Article order : orderList) {
            if (order instanceof Screen) {
                screenList.add((Screen) order);
            }
        }
        return screenList;
    }
}
