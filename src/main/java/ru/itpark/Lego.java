package ru.itpark;

public class Lego {
    private String name;
    private int cost;
    private int costIncludingDiscount;
    private int discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
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

    public Lego(String name, int price, int priceIncludingDiscount, int discount){
        this.name = name;
        this.cost = cost;
        this.costIncludingDiscount = costIncludingDiscount;
        this.discount = discount;
    }
}
