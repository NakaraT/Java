package ru.mirea.task18;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args)
    {
        String FIO, INN;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name => ");
        FIO = scanner.nextLine();
        System.out.print("Enter the TIN number => ");
        INN = scanner.next();
        try
        {
            Integer.parseInt(INN);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error, invalid TIN entered => " + e.getMessage());
        }
    }
}
