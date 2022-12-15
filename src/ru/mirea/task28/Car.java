package ru.mirea.task28;

public class Car {
    int price;
    int year;
    Model model;

    public Car(Model model, int year, int price) {

        this.year = year;
        this.price = price;
        this.model = model;

    }
    public void info() {
        System.out.println("The car => " + model.model + " " + model.speed + " " + price + " " + year);
    }
    private static class Model {
        String model;
        int speed;

        public Model(String model, int speed) {
            this.speed = speed;
            this.model = model;
        }
    }
    public static void main(String[] args) {

        Car Lada = new Car(new Model("LADA", 777), 2004, 80000);
        Lada.info();

        Car Bugatti = new Car(new Model("Bugatti", 410), 2018,  160750000) {
            public void info() {
                System.out.println(model.model + "\nSpeed => " + model.speed + "\nPrice => " + price + "\nYear => " + year);
            }
        };
        System.out.println();
        System.out.println("...:::The choice is obvious:::...");
        Bugatti.info();
    }
}
