package model;

public class Customer extends Person {

    private int fidelityPoint = 0;
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
