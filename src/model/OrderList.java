package model;

import java.util.ArrayList;

public class OrderList {
    // arraylist of order
    private ArrayList<Article> orderList;

    public OrderList() {
        orderList = new ArrayList<Article>();
    }

    // add and order
    public void addOrder(Article order) {
        orderList.add(order);
    }

    // get the order list
    public ArrayList<Article> getOrderList() {
        return orderList;
    }

}
