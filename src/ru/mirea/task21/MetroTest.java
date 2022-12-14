package ru.mirea.task21;

public class MetroTest {
    public static void main(String[] args){
        Metro lines = new Metro();
        System.out.println("Uneven metro lines => ");
        lines.PrintList(true);
        System.out.println("\n");
        System.out.println("Even metro lines => ");
        lines.PrintList(false);
    }
}
