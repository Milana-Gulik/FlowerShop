package by.itstep.gulik.model.entity;

public interface IBouquet {

    void addFlower(AbstractFlower abstractFlower);
    int getBouquetLength();
    int getBouquetWeight();
    double getBouquetCost();
    String getTheMostExpensiveFlower();

}
