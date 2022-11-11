package by.itstep.gulik.model.entity;

public abstract class AbstractFlower {

    private int id_flower;
    private String name;
    private String color;
    private int flower_length;
    private int flower_weight;
    private double price;


    public AbstractFlower(int id_flower) {
        this.id_flower = id_flower;
    }

    public AbstractFlower(int id_flower, String name) {
        this.id_flower = id_flower;
        this.name = name;
    }

    public AbstractFlower(int id_flower, String name, String color) {
        this.id_flower = id_flower;
        this.name = name;
        this.color = color;
    }

    public AbstractFlower(int id_flower, String name, String color, int flower_length) {
        this.id_flower = id_flower;
        this.name = name;
        this.color = color;
        this.flower_length = flower_length;
    }

    public AbstractFlower(int id_flower, String name, String color, int flower_length, int flower_weight) {
        this.id_flower = id_flower;
        this.name = name;
        this.color = color;
        this.flower_length = flower_length;
        this.flower_weight = flower_weight;
    }

    public AbstractFlower(int id_flower, String name, String color, int flower_length,
                          int flower_weight, double price) {
        this.id_flower = id_flower;
        this.name = name;
        this.color = color;
        this.flower_length = flower_length;
        this.flower_weight = flower_weight;
        this.price = price;
    }

    public int getId_flower() {
        return id_flower;
    }

    public void setId_flower(int id_flower) {
        this.id_flower = id_flower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFlower_length() {
        return flower_length;
    }

    public void setFlower_length(int flower_length) {
        this.flower_length = flower_length;
    }

    public int getFlower_weight() {
        return flower_weight;
    }

    public void setFlower_weight(int flower_weight) {
        this.flower_weight = flower_weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
