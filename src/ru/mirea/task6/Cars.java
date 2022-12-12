package ru.mirea.task6;


public class Cars implements Nameable {
    private String name;
    private String brand;
    private String color;
    public String getName(){
        return name;
    }

    public Cars(String name, String brand, String color) {
        this.name = name;
        this.brand = brand;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
