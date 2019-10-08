package ru.itpark;

import ru.itpark.Lego;

public class Cart {
    private int cost;
    private int amountOfGoods;
    private int costIncludingDiscounts;
    private int totalCost = costIncludingDiscounts * amountOfGoods;

    public int getTotalCost(int i) { return totalCost;}


    public void add (Lego lego70419, int amountOfGoods) {amountOfGoods += lego70419.getCostIncludingDiscount(); }
}