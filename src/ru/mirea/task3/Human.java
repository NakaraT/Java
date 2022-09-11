package ru.mirea.task3;
import java.util.Scanner;

public class Human {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of hand ");
        int HandLenght = sc.nextInt();
        Hand hand = new Hand(HandLenght);
        sc.nextLine();

        System.out.println("Enter lenght of head ");
        int HeadLenght = sc.nextInt();
        Head head = new Head(HeadLenght);
        sc.nextLine();

        System.out.println("Enter lenght of leg ");
        int LegLenght = sc.nextInt();
        Leg leg = new Leg(LegLenght);
        sc.nextLine();
        double[] HumanLenght = new double[3];
        HumanLenght[0] = HandLenght;
        HumanLenght[1] = HeadLenght;
        HumanLenght[2] = LegLenght;
        for (int i = 0; i < HumanLenght.length; i++) {
            System.out.println(HumanLenght[i]);
        }
    }
}
