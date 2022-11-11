package by.itstep.gulik.model.logic;

import by.itstep.gulik.model.entity.AbstractFlower;

public class CheckerLength {

    public static boolean checkLength(AbstractFlower[] abstractFlowers) {
        boolean result = true;
        if (abstractFlowers[abstractFlowers.length - 1] != null) {
            result = false;
        }
        return result;
    }

    public static int getPosition(AbstractFlower[] abstractFlowers) {
        int position = 0;

        for (int i = 0; i < abstractFlowers.length; i++) {
            if (abstractFlowers[i] == null) {
                position = i;
                break;
            }
        }
        return position;
    }

}
