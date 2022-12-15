package ru.mirea.task20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DataCalendar {
    static void Date()
    {
        Scanner scanner = new Scanner(System.in);
        int year, month, date, hours, min;
        System.out.println("Working with the Date class: ");
        System.out.print("Enter the year =>");
        year = scanner.nextInt();
        System.out.print("Enter the month => ");
        month = scanner.nextInt();
        System.out.print("Enter the date => ");
        date = scanner.nextInt();
        System.out.print("Enter the hour => ");
        hours = scanner.nextInt();
        System.out.print("Enter minutes => ");
        min = scanner.nextInt();
        Date userDate = new Date();
        userDate.setYear(year - 1900);
        userDate.setMonth(month - 1);
        userDate.setDate(date);
        userDate.setHours(hours);
        userDate.setMinutes(min);
        System.out.println(userDate);
    }

    static void Calendar()
    {
        Scanner scanner = new Scanner(System.in);
        int year, month, date, hours, min;
        System.out.println("Working with the Calendar class: ");
        System.out.print("Enter the year =>");
        year = scanner.nextInt();
        System.out.print("Enter the month => ");
        month = scanner.nextInt();
        System.out.print("Enter the date => ");
        date = scanner.nextInt();
        System.out.print("Enter the hour => ");
        hours = scanner.nextInt();
        System.out.print("Enter minutes => ");
        min = scanner.nextInt();
        Calendar calendar = new GregorianCalendar(year, month, date, hours, min);
        System.out.println("\tYear: " + calendar.get(Calendar.YEAR));
        System.out.println("\tMonth: " + calendar.get(Calendar.MONTH));
        System.out.println("\tDate: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("\tHour: " + calendar.get(Calendar.HOUR));
        System.out.println("\tMinutes: " + calendar.get(Calendar.MINUTE));
    }

    public static void main(String[] args)
    {
        Date();
        Calendar();
    }
}
