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
}
