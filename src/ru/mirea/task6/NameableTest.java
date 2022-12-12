package ru.mirea.task6;

public class NameableTest {
    public static void main(String[] args) {
        Nameable a = new Animals("Animal","Dog", "Wolf");
        System.out.println(a);
        Nameable c = new Cars("Car","BMW","Black");
        System.out.println(c);
    }
}
