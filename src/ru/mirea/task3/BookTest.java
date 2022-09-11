package ru.mirea.task3;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Author of the book: ");
        String author = sc.nextLine();

        System.out.println("Enter the Name of the book: ");
        String name = sc.nextLine();

        System.out.println("Enter the Year of the book: ");
        int year = sc.nextInt();
        sc.nextLine();
        Book book = new Book(author, name, year);
        System.out.println(author + " / " + name + " (" + year + ").");
    }
}
