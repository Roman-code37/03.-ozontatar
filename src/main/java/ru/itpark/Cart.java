package ru.itpark;

public class Cart {
    private int cost;
    private int amountOfGoods;
    private int discount;
    private int costIncludingDiscounts;
    public int getCostIncludingDiscounts () { return costIncludingDiscounts;}



    public void add (Lego lego70419, int count) {amountOfGoods += lego70419.getCost() * count; }

}