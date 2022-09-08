package ru.mirea.task1.opt3;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        System.out.println("___3___");
        int Array[] = {12, 34, 56, 78, 90};
        int summ = 0;
        for (int i = 0; i < Array.length; i++) {
            summ = summ + Array[i];
        }
        System.out.println("_for_");
        System.out.println(summ);
        int j = 0;
        summ = 0;
        while(j < Array.length) {
            summ = summ + Array[j];
            j++;
            }
        System.out.println("_while_");
        System.out.println(summ);
        int k = 0;
        summ = 0;
        do {
            summ = summ + Array[k];
            k++;
        }
        while(k < Array.length);
        System.out.println("_do_while_");
        System.out.println(summ);
        System.out.println("___4___");
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println("___5___");
        for (int i = 1 ; i < 11 ; i++) {
            System.out.print(i + ") ");
            System.out.println(1. / i);
        }
        System.out.println("___6___");
        int[] array;
        array = new int[12];
        for (int i = 0; i < array.length; i = i + 2) {
            array[i] = ((int)(Math.random() * 30) - 15);
            Random random = new Random();
            int abc = random.nextInt(100);
            array[i + 1] = abc;
            System.out.print(array[i] + " " + array[i + 1] + " ");
        }
        Arrays.sort(array);
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();
        System.out.println("___7___");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int Count = in.nextInt();
        int num = 1;
        int a = 1;
        int sc = 1;
        do {
            num = num * a;
            System.out.println("!"+ sc + " = " + num);
            a ++;
            sc ++;
        }
        while (sc < Count + 1);
    }
}