package by.itstep.gulik.model.entity.default_bouquet;

import by.itstep.gulik.model.entity.Default_Bouquet;
import by.itstep.gulik.model.entity.flower.Flower_Lily;

public class Default_Bouquet1 extends Default_Bouquet {

    public Default_Bouquet1() {
        add_flower(new Flower_Lily());
        add_flower(new Flower_Lily());
        add_flower(new Flower_Lily());
        add_flower(new Flower_Lily());
        add_flower(new Flower_Lily());
    }
}
