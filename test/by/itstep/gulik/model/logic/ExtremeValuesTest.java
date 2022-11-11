package by.itstep.gulik.model.logic;

import by.itstep.gulik.model.entity.AbstractFlower;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtremeValuesTest {

    private AbstractFlower[] abstractFlowers;


    @Test
    public void theMostExpensiveFlower() {
        try {
            boolean expectedValue = false;
            AbstractFlower[] abstractFlowers = null;
            ExtremeValues extremevalues = new ExtremeValues();
            boolean actualValue = extremevalues.theMostExpensiveFlower(abstractFlowers);
            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }


    @Test
    public void testTheMostExpensiveFlowerPositive() {
        AbstractFlower[] numbers = {};
        boolean expected = true;

        boolean actual = ExtremeValues.theMostExpensiveFlower(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testTheMostExpensiveFlowerNegative() {
        AbstractFlower[] cost = {};
        boolean expected = true;

        boolean actual = ExtremeValues.theMostExpensiveFlower(cost);

        assertEquals(expected, actual);

    }
//
    @Test(expected = RuntimeException.class)
    public void testMostExpensiveFlowerWithNull() {
        ExtremeValues.theMostExpensiveFlower(null);
    }


}