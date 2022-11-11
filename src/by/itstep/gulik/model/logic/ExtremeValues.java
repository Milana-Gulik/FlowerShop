package by.itstep.gulik.model.logic;

import by.itstep.gulik.model.entity.AbstractFlower;

public class ExtremeValues {

    private AbstractFlower[] abstractFlowers;

    public static boolean theMostExpensiveFlower(AbstractFlower[] abstractFlowers) {

        String name = "Rose";

        if (abstractFlowers == null || abstractFlowers.length == 0) {
            throw new RuntimeException();
        }

        AbstractFlower max = abstractFlowers[0];

        for (int i = 1; i < abstractFlowers.length; i++) {
            if (abstractFlowers[i].getPrice() > max.getPrice()) {
                max = abstractFlowers[i];
            }
        }

        return true;
    }

}