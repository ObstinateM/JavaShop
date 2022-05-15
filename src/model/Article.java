package model;

public class Article {

    protected int id;
    protected String name;
    protected double price;
    protected int inventory;
    protected int numberOfSell;

    public Article(int id, String name, double price, int inventory, int numberOfSell) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.numberOfSell = numberOfSell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getNumberOfSell() {
        return numberOfSell;
    }

    public void setNumberOfSell(int numberOfSell) {
        this.numberOfSell = numberOfSell;
    }
}
