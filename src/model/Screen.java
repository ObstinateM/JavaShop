package model;

public class Screen extends Article {
    private int width;
    private int height;
    private int refreshRate;
    private int responseTime;

    public Screen(int id, String name, double price, int inventory, int numberOfSell, int width,
            int height, int refreshRate, int responseTime) {
        super(id, name, price, inventory, numberOfSell);
        this.width = width;
        this.height = height;
        this.refreshRate = refreshRate;
        this.responseTime = responseTime;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }
}
