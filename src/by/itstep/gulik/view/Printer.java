package by.itstep.gulik.view;

import by.itstep.gulik.model.entity.AbstractFlower;

public class Printer {

    public static void printBouquet(AbstractFlower[] abstractFlowers) {
        StringBuilder stringBuilder = new StringBuilder(abstractFlowers.length);
        stringBuilder.append("The bouquet consists of the following flowers: ");
        for (AbstractFlower abstractFlower: abstractFlowers) {
            stringBuilder.append(abstractFlower.getName());
            stringBuilder.append(" ");
            System.out.println(stringBuilder.toString());
        }
    }

    public static void printLength (double length) {
        System.out.println("Length of this bouquet: " + length + " centimeters");
    }

    public static void printWeight (double weight) {
        System.out.println("Weight of this bouquet: " + weight + " grams");
    }

    public static void printPrice (double price) {
        System.out.println("Price of this bouquet: " + price + " belarusian rubles");
    }

    public static void printTheMostExpensiveFlower (String name) {
        System.out.println("The most expensive flower: " + name);
    }

    public static void printTheCheapestFlower (String name) {
        System.out.println("The cheapest flower: " + name);
    }
}
