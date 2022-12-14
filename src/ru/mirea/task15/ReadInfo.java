package ru.mirea.task15;

import java.io.*;

public class ReadInfo {
    public static void main(String[] args){
        try (FileReader reader = new FileReader("C:\\Users\\Vyacheslav\\IdeaProjects\\Java\\src\\ru\\mirea\\task15\\Info.txt")){
            System.out.println("The text was received from the file => ");
            int c;
            while ((c = reader.read()) != -1)
                System.out.print((char) c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
