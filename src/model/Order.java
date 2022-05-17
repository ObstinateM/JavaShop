package model;

public class Order {
    private int id;
    private int idClient;
    private String orderName;
    private double totalPrice;
    private int numberOfItems;

    public Order(int id, int idClient, int number, String orderName, double totalPrice) {
        this.id = id;
        this.idClient = idClient;
        this.numberOfItems = number;
        this.orderName = orderName;
        this.totalPrice = totalPrice;
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

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

}
