package ru.mirea.task10;

import java.util.Scanner;

public class num3 {

    public static void main(String args[]) {
        System.out.println("Enter a number A => ");
        Scanner sc = new Scanner(System.in);
        int numa = sc.nextInt();
        System.out.println("Enter a number B => ");
        Scanner sca = new Scanner(System.in);
        int numb = sca.nextInt();
        if (numa < numb) {
            for (int i = numa; i < numb + 1; i++)
                System.out.println(i);
        } else {
            for (int i = numa; i > numb - 1; i--)
                System.out.println(i);
        }
    }
}
