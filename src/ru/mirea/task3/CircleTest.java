package ru.mirea.task3;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int r = sc.nextInt();
        sc.nextLine();
        Circle circle = new Circle(r);
        System.out.println("Circumference length - " + circle.getC());
        System.out.println("Diameter of the circle - " + circle.getD());
        System.out.println("Area of the circle - " + circle.getS());
    }
}
