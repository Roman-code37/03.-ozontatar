package ru.itpark;

public class Lego {
    private String name;
    private int cost;
    private int costIncludingDiscount;
    public Lego(String name, int cost, int costIncludingDiscount){
        this.name = name;
        this.cost = cost;
        this.costIncludingDiscount = costIncludingDiscount; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCostIncludingDiscount() {
        return costIncludingDiscount;
    }

    public void setCostIncludingDiscount(int costIncludingDiscount) {
        this.costIncludingDiscount = costIncludingDiscount;
    }
}
