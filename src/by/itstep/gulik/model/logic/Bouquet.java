package by.itstep.gulik.model.logic;

import by.itstep.gulik.model.entity.AbstractFlower;
import by.itstep.gulik.model.entity.IBouquet;

public class Bouquet implements IBouquet {

    private AbstractFlower[] abstractFlowers;

    public Bouquet (int count) {
        abstractFlowers = new AbstractFlower[count];
    }

    public AbstractFlower[] getAbstractFlowers() {
        return this.abstractFlowers;
    }

    @Override
    public void addFlower(AbstractFlower abstractFlower) {
        if (CheckerLength.checkLength(this.abstractFlowers)) {
            int position = CheckerLength.getPosition(this.abstractFlowers);
            this.abstractFlowers[position] = abstractFlower; }
        else {
            System.out.println("Error! Not enough space in the bouquet");
        }
    }

    @Override
    public int getBouquetLength() {
        int length = 0;
        for (AbstractFlower abstractFlower : this.abstractFlowers) {
            if (abstractFlower != null)
                length += abstractFlower.getFlower_length();
            else
                break;
        }
        return length;
    }


    @Override
    public int getBouquetWeight() {
        int weight = 0;
        for (AbstractFlower abstractFlower : this.abstractFlowers) {
            if (abstractFlower != null)
                weight += abstractFlower.getFlower_weight();
            else
                break;
        }
        return weight;
    }


    @Override
    public double getBouquetCost() {
        double result = 0;
        for(AbstractFlower abstractFlower : this.abstractFlowers) {
            if (abstractFlower != null)
            result += abstractFlower.getPrice();
            else
                break;
        }
        return result;
    }

    @Override
    public String getTheMostExpensiveFlower() {
        if (ExtremeValues.theMostExpensiveFlower(this.abstractFlowers)) {
            int position = CheckerLength.getPosition(this.abstractFlowers); }
        String name = " ";
        for (AbstractFlower abstractFlower: this.abstractFlowers) {
            if (abstractFlower != null)
                name = abstractFlower.getName();
            else
                break;
        }
        return name;
    }

}
