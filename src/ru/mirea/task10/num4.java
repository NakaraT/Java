package ru.mirea.task10;

import java.util.Scanner;

public class num4 {

    public static void main (String args[]){
        System.out.println("Enter a number k => ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < 999; i++)
            if(((i % 10)+(i % 100) / 10 + i / 100) == k)
                sum++;
        System.out.println(sum);
    }
}