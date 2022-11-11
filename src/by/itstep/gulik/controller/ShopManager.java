package by.itstep.gulik.controller;

import by.itstep.gulik.model.entity.AbstractFlower;
import by.itstep.gulik.model.entity.Default_Bouquet;
import by.itstep.gulik.model.entity.default_bouquet.*;
import by.itstep.gulik.model.entity.flower.*;

public class ShopManager {
    Default_Bouquet[] def_buckets = {new by.itstep.gulik.model.entity.default_bouquet.Default_Bouquet(),
            new Default_Bouquet1(), new Default_Bouquet2(),
            new Default_Bouquet3(), new Default_Bouquet4(), new Default_Bouquet5(), new Default_Bouquet6()};
    AbstractFlower[] flowers = {new Flower_Orchid(), new Flower_Lily(),
            new Flower_Chrysanthemum(), new Flower_Hydrangea(), new Flower_Iris(), new Flower_Rose(),
            new Flower_Tulip()};

    public void Choose_def_bucket() {
        System.out.println("Our default buckets:");
        for (Default_Bouquet bucket : def_buckets) {
            System.out.println("* " + bucket.show_bucket() + " ----- " + bucket.Calculate_Price()
                    + " belarusian rubles");
        }
    }
}

