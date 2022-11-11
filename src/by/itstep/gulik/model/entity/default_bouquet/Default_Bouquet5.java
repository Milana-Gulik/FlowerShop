package by.itstep.gulik.model.entity.default_bouquet;

import by.itstep.gulik.model.entity.Default_Bouquet;
import by.itstep.gulik.model.entity.flower.Flower_Chrysanthemum;
import by.itstep.gulik.model.entity.flower.Flower_Lily;
import by.itstep.gulik.model.entity.flower.Flower_Rose;

public class Default_Bouquet5 extends Default_Bouquet {

    public Default_Bouquet5() {
        add_flower(new Flower_Rose());
        add_flower(new Flower_Chrysanthemum());
        add_flower(new Flower_Rose());
        add_flower(new Flower_Chrysanthemum());
        add_flower(new Flower_Rose());
        add_flower(new Flower_Chrysanthemum());
        add_flower(new Flower_Rose());
        add_flower(new Flower_Lily());
        add_flower(new Flower_Rose());

    }
}
