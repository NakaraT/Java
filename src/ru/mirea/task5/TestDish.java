package ru.mirea.task5;

public class TestDish {
    public static void main(String[] args) {
        Cup c = new Cup("glass","transparent","1000ml");
        Plate p = new Plate("ceramic", "white", "32sm");
        System.out.println(c);
        System.out.println(p);
    }
}