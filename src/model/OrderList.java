package model;

import java.util.ArrayList;

public class OrderList {
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
}
