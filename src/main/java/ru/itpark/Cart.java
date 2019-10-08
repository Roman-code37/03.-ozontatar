package ru.itpark;

import ru.itpark.Lego;

public class Cart {
    private int cost;
    private int amountOfGoods;
    private int costIncludingDiscounts;
    private int totalCost = costIncludingDiscounts * amountOfGoods;

    public int getTotalCost(int Lego) { return totalCost;}
    public int getCostIncludingDiscounts( int Lego) { return costIncludingDiscounts;}
    public int getCost (int Lego) {return cost;}
    public int getAmountOfGoods (int Lego) { return amountOfGoods;}


    public void add (Lego lego70419, int amountOfGoods) {amountOfGoods += lego70419.getCostIncludingDiscount(); }
}