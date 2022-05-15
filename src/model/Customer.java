package model;

import java.util.ArrayList;

public class Customer extends Person {

    // TODO: changer le type pour le type order
    private int fidelityPoint = 0;
    // private ArrayList<Order> orderList;
    private ArrayList<String> orderList;
    private int numberOfDiscountAvailable = 0;

    public Customer(String firstName, String lastName, String dob, String sex, int id) {
        super(firstName, lastName, dob, sex, id);
    }

    public int getFidelityPoint() {
        return this.fidelityPoint;
    }

    public void setFidelityPoint(int fidelityPoint) {
        this.fidelityPoint = fidelityPoint;
    }

    public int getNumberOfOrder() {
        return this.orderList.size();
    }

    public ArrayList<String> getOrderList() {
        return this.orderList;
    }

    public void addOrder(String order) {
        this.orderList.add(order);
    }

    public boolean isDiscountAvailable() {
        return this.numberOfDiscountAvailable > 0;
    }

    public boolean canClaimDiscount() {
        return this.fidelityPoint - 50 >= 0;
    }

    public void claimDiscount() {
        if (!canClaimDiscount())
            return;
        this.fidelityPoint -= 50;
        this.numberOfDiscountAvailable += 1;
    }

    public int getNumberOfDiscountAvailable() {
        return this.numberOfDiscountAvailable;
    }
}
