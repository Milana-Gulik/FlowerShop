package by.itstep.gulik.controller;

import by.itstep.gulik.model.entity.flower.*;
import by.itstep.gulik.model.logic.Bouquet;
import by.itstep.gulik.view.Printer;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet(7);

        Flower_Rose flower_rose = new Flower_Rose();
        Flower_Iris flower_iris = new Flower_Iris();
        Flower_Tulip flower_tulip = new Flower_Tulip();
        Flower_Hydrangea flower_hydrangea = new Flower_Hydrangea();
        Flower_Chrysanthemum flower_chrysanthemum = new Flower_Chrysanthemum();
        Flower_Orchid flower_orchid = new Flower_Orchid();
        Flower_Lily flower_lily = new Flower_Lily();

        bouquet.addFlower(flower_chrysanthemum);
        bouquet.addFlower(flower_hydrangea);
        bouquet.addFlower(flower_iris);
        bouquet.addFlower(flower_rose);
        bouquet.addFlower(flower_tulip);
        bouquet.addFlower(flower_orchid);
        bouquet.addFlower(flower_lily);


        Printer.printBouquet(bouquet.getAbstractFlowers());
        Printer.printLength(bouquet.getBouquetLength());
        Printer.printWeight(bouquet.getBouquetWeight());
        Printer.printPrice(bouquet.getBouquetCost());
        Printer.printTheMostExpensiveFlower(bouquet.getTheMostExpensiveFlower());

    }
}
