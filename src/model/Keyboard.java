package model;

public class Keyboard extends Article {
    private boolean isMechanical = false;
    private boolean isRGB = false;
    private boolean isWireless = false;
    private boolean hasKeypad = false;

    public Keyboard(int id, String name, double price, int inventory, int numberOfSell,
            boolean isMechanical, boolean isRGB, boolean isWireless, boolean hasKeypad) {
        super(id, name, price, inventory, numberOfSell);
        this.isMechanical = isMechanical;
        this.isRGB = isRGB;
        this.isWireless = isWireless;
        this.hasKeypad = hasKeypad;
    }

    public boolean isMechanical() {
        return isMechanical;
    }

    public void setMechanical(boolean isMechanical) {
        this.isMechanical = isMechanical;
    }

    public boolean isRGB() {
        return isRGB;
    }

    public void setRGB(boolean isRGB) {
        this.isRGB = isRGB;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public boolean hasKeypad() {
        return hasKeypad;
    }

    public void setKeypad(boolean hasKeypad) {
        this.hasKeypad = hasKeypad;
    }
}
