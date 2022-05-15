package model;

import java.util.ArrayList;

public class Order {
    private int id;
    private int idClient;
    private String orderName;
    private double totalPrice;
    private int numberOfItems;
    private ArrayList<Article> articlesList = new ArrayList<Article>();

    public Order(int id, int idClient, int number, String orderName, double totalPrice,
            ArrayList<Article> articlesList) {
        this.id = id;
        this.idClient = idClient;
        this.numberOfItems = number;
        this.orderName = orderName;
        this.totalPrice = totalPrice;
        this.articlesList = articlesList;
    }

    public int getId() {
        return id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getQuantity() {
        return numberOfItems;
    }

    public void setQuantity(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ArrayList<Article> getArticlesList() {
        return articlesList;
    }

    public void addArticle(Article article) {
        this.articlesList.add(article);
    }

}
