package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Vyacheslav", "Totsamyi@mail.ru", 'M');
        System.out.println(a1);
        System.out.println("Chance email:");
        a1.setEmail("Stalin@google.com");
        System.out.println(a1);
    }
}