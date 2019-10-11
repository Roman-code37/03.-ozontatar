package ru.itpark;

public class Lego {
    private String name;
    private int cost;
    private int costIncludingDiscount;
    private int amountOfGoods;
    private boolean added;
    private int totalCost;

    public Lego(String name, int cost, int costIncludingDiscount){
        this.name = name;
        this.cost = cost;
        this.costIncludingDiscount = costIncludingDiscount;
    totalCost = costIncludingDiscount * amountOfGoods;}

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
        this.costIncludingDiscount = costIncludingDiscount; }

    public boolean isAdded() { return added; }

    public void setAdded(boolean add) {
        this.added = added;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }

    public void setAmountOfGoods(int amountOfGoods) {
        this.amountOfGoods = amountOfGoods;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

}
