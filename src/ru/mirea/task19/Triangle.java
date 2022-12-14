package ru.mirea.task19;

import java.util.Scanner;

public class Triangle {
    public Triangle(int angle1, int angle2, int angle3) throws InvalidAngle {
        if ((angle1 + angle2 + angle3 != 180) || (angle1!=90  && angle2!=90 && angle3!=90)) {
            System.out.println("The angles are set incorrectly.");
            new InvalidAngle("The angles are set incorrectly.");
        }
        else System.out.println("The triangle has been successfully created.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angles of the triangle => ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        try {
            Triangle tr = new Triangle(angle1, angle2, angle3);
        } catch (InvalidAngle exc) {
            exc.printStackTrace();
        }
    }
}
