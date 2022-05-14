package model;

public class Computer extends Article {
    private String proc;
    private int ramGB;
    private int hddGB;

    public Computer(int id, String name, double price, int inventory, int numberOfSell, String proc,
            int ramGB, int hddGB) {
        super(id, name, price, inventory, numberOfSell);
        this.proc = proc;
        this.ramGB = ramGB;
        this.hddGB = hddGB;
    }

    public String getProc() {
        return proc;
    }

    public int getRamGB() {
        return ramGB;
    }

    public int getHddGB() {
        return hddGB;
    }
}
