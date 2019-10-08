package ru.itpark;

public class Main {
    public static void main(String[] args) {
        Lego lego70419 = new Lego(
                "Старый рыбацкий корабль",
                2_299,
                1_563);

        Lego lego70420 = new Lego(
                "Загадка старого кладбища",
                2_299,
                1_540);

        Lego lego70421 = new Lego(
                "Трюковый грузовик Эль-Фуэго",
                2_999,
                2_039);

        System.out.println(lego70419.getName());

        Cart cart = new Cart();
        cart.add(lego70419, 2);
        System.out.println(cart.getTotalCost(2));
    }
}