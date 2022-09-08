package ru.mirea.task2;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Dog[] list = new Dog[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dogs");
        int k = sc.nextInt();
        sc.nextLine();
        String tempName;
        int tempAge;
        for (int i = 0; i < k; i++){
            System.out.println("Enter the dog's name");
            tempName = sc.nextLine();
            System.out.println("Enter the dog's age");
            tempAge = sc.nextInt();
            list[i] = new Dog(tempName, tempAge);
            sc.nextLine();
        }
        for (int i = 0; i < k; i++){
            System.out.println("Age of dog *"+ list[i].getName() + "* in human counting: " + list[i].toHumanAge());
        }

    }
}