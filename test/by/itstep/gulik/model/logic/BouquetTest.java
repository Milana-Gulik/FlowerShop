package by.itstep.gulik.model.logic;

import by.itstep.gulik.model.entity.AbstractFlower;
import by.itstep.gulik.model.entity.Default_Bouquet;
import by.itstep.gulik.model.entity.IBouquet;
import org.junit.Assert;
import org.junit.Test;

public class BouquetTest {

    private AbstractFlower[] abstractFlowers;

    @Test
    public void testTotalShouldReturnNotNull() {
        Bouquet bouquet = new Bouquet(1);
        bouquet.addFlower(new AbstractFlower(1, "Rose", "green",
                70, 45, 9) {
        });

        Bouquet actual = new Bouquet(1);

        Assert.assertNotNull(actual);
    }

    @Test
    public void testReturnCorrectTotalPrice() {
        Bouquet bouquet1 = new Bouquet(1);
        Bouquet bouquet2 = new Bouquet(1);


        bouquet1.addFlower(new AbstractFlower(11, "Tulip", "red", 60, 20, 16) {
        });
        bouquet2.addFlower(new AbstractFlower(12, "Rose", "red", 60, 20, 20) {
        });


        double expected = bouquet1.getBouquetCost() + bouquet2.getBouquetCost();
        double actual = 36;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testReturnCorrectTotalPriceAllFlowers() {
        Bouquet bouquet1 = new Bouquet(1);
        Bouquet bouquet2 = new Bouquet(1);
        Bouquet bouquet3 = new Bouquet(1);
        Bouquet bouquet4 = new Bouquet(1);
        Bouquet bouquet5 = new Bouquet(1);
        Bouquet bouquet6 = new Bouquet(1);
        Bouquet bouquet7 = new Bouquet(1);


        bouquet1.addFlower(new AbstractFlower(1, "Orchid", "pink",
                70, 135, 29.99) {
        });
        bouquet2.addFlower(new AbstractFlower(2, "Tulip", "yellow",
                55, 30, 3.50) {
        });
        bouquet3.addFlower(new AbstractFlower(3, "Rose", "red",
                70, 70, 9) {
        });
        bouquet4.addFlower(new AbstractFlower(4, "Iris", "violet",
                60, 30, 6.98) {
        });
        bouquet5.addFlower(new AbstractFlower(5, "Hydrangea", "blue",
                50, 80, 25.40) {
        });
        bouquet6.addFlower(new AbstractFlower(6, "Chrysanthemum", "white",
                50, 40, 7.70) {
        });
        bouquet7.addFlower(new AbstractFlower(7, "Lily", "white",
                65, 70, 30) {
        });

        double expected = bouquet1.getBouquetCost() + bouquet2.getBouquetCost() + bouquet3.getBouquetCost()
                + bouquet4.getBouquetCost() + bouquet5.getBouquetCost() + bouquet6.getBouquetCost()
                + bouquet7.getBouquetCost();
        double actual = 112.57;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testReturnCorrectTotalLength() {
        Bouquet bouquet1 = new Bouquet(1);
        Bouquet bouquet2 = new Bouquet(1);


        bouquet1.addFlower(new AbstractFlower(11, "Tulip", "red", 60, 20, 16) {
        });
        bouquet2.addFlower(new AbstractFlower(12, "Rose", "red", 60, 20, 20) {
        });


        double expected = (bouquet1.getBouquetLength() + bouquet2.getBouquetLength()) / 2;
        double actual = 60;

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void testReturnCorrectTotalLengthAllFlowers() {
        Bouquet bouquet1 = new Bouquet(1);
        Bouquet bouquet2 = new Bouquet(1);
        Bouquet bouquet3 = new Bouquet(1);
        Bouquet bouquet4 = new Bouquet(1);
        Bouquet bouquet5 = new Bouquet(1);
        Bouquet bouquet6 = new Bouquet(1);
        Bouquet bouquet7 = new Bouquet(1);


        bouquet1.addFlower(new AbstractFlower(1, "Orchid", "pink",
                70, 135, 29.99) {
        });
        bouquet2.addFlower(new AbstractFlower(2, "Tulip", "yellow",
                55, 30, 3.50) {
        });
        bouquet3.addFlower(new AbstractFlower(3, "Rose", "red",
                70, 70, 9) {
        });
        bouquet4.addFlower(new AbstractFlower(4, "Iris", "violet",
                60, 30, 6.98) {
        });
        bouquet5.addFlower(new AbstractFlower(5, "Hydrangea", "blue",
                50, 80, 25.40) {
        });
        bouquet6.addFlower(new AbstractFlower(6, "Chrysanthemum", "white",
                50, 40, 7.70) {
        });
        bouquet7.addFlower(new AbstractFlower(7, "Lily", "white",
                65, 70, 30) {
        });

        double expected = (bouquet1.getBouquetLength() + bouquet2.getBouquetLength() + bouquet3.getBouquetLength()
                + bouquet4.getBouquetLength() + bouquet5.getBouquetLength() + bouquet6.getBouquetLength()
                + bouquet7.getBouquetLength()) / 7;
        double actual = 60;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testReturnCorrectTotalWeightAllFlowers() {
        Bouquet bouquet1 = new Bouquet(1);
        Bouquet bouquet2 = new Bouquet(1);
        Bouquet bouquet3 = new Bouquet(1);
        Bouquet bouquet4 = new Bouquet(1);
        Bouquet bouquet5 = new Bouquet(1);
        Bouquet bouquet6 = new Bouquet(1);
        Bouquet bouquet7 = new Bouquet(1);


        bouquet1.addFlower(new AbstractFlower(1, "Orchid", "pink",
                70, 135, 29.99) {
        });
        bouquet2.addFlower(new AbstractFlower(2, "Tulip", "yellow",
                55, 30, 3.50) {
        });
        bouquet3.addFlower(new AbstractFlower(3, "Rose", "red",
                70, 70, 9) {
        });
        bouquet4.addFlower(new AbstractFlower(4, "Iris", "violet",
                60, 30, 6.98) {
        });
        bouquet5.addFlower(new AbstractFlower(5, "Hydrangea", "blue",
                50, 80, 25.40) {
        });
        bouquet6.addFlower(new AbstractFlower(6, "Chrysanthemum", "white",
                50, 40, 7.70) {
        });
        bouquet7.addFlower(new AbstractFlower(7, "Lily", "white",
                65, 70, 30) {
        });

        double expected = bouquet1.getBouquetWeight() + bouquet2.getBouquetWeight() + bouquet3.getBouquetWeight()
                + bouquet4.getBouquetWeight() + bouquet5.getBouquetWeight() + bouquet6.getBouquetWeight()
                + bouquet7.getBouquetWeight();
        double actual = 455.0;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testReturnCorrectTotalLengthAllFlowersWithNull() {
        Bouquet bouquet1 = new Bouquet(1);
        Bouquet bouquet2 = new Bouquet(1);
        Bouquet bouquet3 = new Bouquet(1);
        Bouquet bouquet4 = new Bouquet(1);
        Bouquet bouquet5 = new Bouquet(1);
        Bouquet bouquet6 = new Bouquet(1);
        Bouquet bouquet7 = new Bouquet(1);


        bouquet1.addFlower(new AbstractFlower(1, "Orchid", "pink",
                0, 135, 29.99) {
        });
        bouquet2.addFlower(new AbstractFlower(2, "Tulip", "yellow",
                0, 30, 3.50) {
        });
        bouquet3.addFlower(new AbstractFlower(3, "Rose", "red",
                0, 70, 9) {
        });


        double expected = (bouquet1.getBouquetLength() + bouquet2.getBouquetLength() + bouquet3.getBouquetLength() / 3);
        double actual = 0;

        Assert.assertEquals(expected, actual, 0);
    }

}

