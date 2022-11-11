package by.itstep.gulik.model.entity;

import by.itstep.gulik.model.entity.AbstractFlower;

import java.util.ArrayList;

public abstract class Default_Bouquet {
    ArrayList<AbstractFlower> bucket;

    public Default_Bouquet(){
        bucket = new ArrayList<AbstractFlower>();
    }
    public double Calculate_Price(){
        int total_price = 0;
        for(AbstractFlower abstractFlower: this.bucket){
            total_price += abstractFlower.getPrice();
        }
        return total_price;
    }
    public void add_flower(AbstractFlower flower){
        this.bucket.add(flower);
    }
    public void delete_flower(AbstractFlower flower){
        this.bucket.remove(flower);
    }
    public String show_bucket(){
        String Flowers = "";
        for(AbstractFlower flower : this.bucket){
            Flowers += flower.getName() + ",";

        }
        return Flowers;
    }
}
