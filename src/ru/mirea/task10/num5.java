package ru.mirea.task10;

import java.util.Scanner;

public class num5 {
    public static int sum(int n){
        if ( n/10 == 0 ){
            return n;
        }
        return n%10 + sum (n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number => ");
        int n = sc.nextInt();
        System.out.println("The sum of the digits of the number => " + sum(n));
    }
}
