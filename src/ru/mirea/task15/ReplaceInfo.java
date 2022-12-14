package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class ReplaceInfo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text;

        try(FileWriter writer = new FileWriter("C:\\Users\\Vyacheslav\\IdeaProjects\\Java\\src\\ru\\mirea\\task15\\Info.txt", false)) {
            System.out.println("Enter the information you want to transfer to a text file =>");
            text = scanner.nextLine();
            writer.write(text);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
