package ru.mirea.task5;


public class Dish {
    protected String material;
    protected String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "material " + material + '\'' +
                ", color" + color + '\'' +
                '}';
    }
}