package ru.itpark;
import ru.itpark.Lego;
public class Cart {
    private int cost;
    private int amountOfGoods = 2;
    private int costIncludingDiscounts;
    private int totalCost;
    private boolean legoAdded;

    public void add(Lego lego) {
        if (legoAdded == true) {
            return; }
        amountOfGoods += lego.getCost();
        costIncludingDiscounts += lego.getCostIncludingDiscount();
        lego.setAdded(true);
    }

    public void remove(Lego lego) {
        lego.setAdded(false);
        cost -= lego.getCost();
        costIncludingDiscounts = costIncludingDiscounts - lego.getCostIncludingDiscount();
    }
    public boolean isLegoAdded() {
        if (legoAdded) return true;
        else return false;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCostIncludingDiscounts() {
        return costIncludingDiscounts;
    }

    public void setCostIncludingDiscounts(int costIncludingDiscounts) {
        this.costIncludingDiscounts = costIncludingDiscounts;
    }

    public void setLegoAdded(boolean legoAdded) {
        this.legoAdded = legoAdded;
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
    public int getCost() {
        return cost;
    }
}