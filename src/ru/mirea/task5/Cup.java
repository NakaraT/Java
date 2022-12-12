package ru.mirea.task5;

public class Cup extends Dish {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Cup(String material, String color, String size) {
        super(material, color);
        this.size = size;
    }

    public String toString() {
        return "Cup{" +
                "Size: " + size +
                ", material: " + material +
                ", color: " + color +
                '}';
    }
}
