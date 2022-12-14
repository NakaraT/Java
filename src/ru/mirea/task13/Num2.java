package ru.mirea.task13;

import java.util.*;

public class Num2 {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<String>();

        //Добавление эл-ов в коллекцию
        names.add("Vyacheslav");
        names.add("Roman");
        names.add("Jora");
        names.add("Andrei");
        names.add("Korpalo");
        names.add("Artem");
        names.addLast("Inok");
        names.addFirst("Sasha");
        names.add(4, "Opa");

        System.out.println("В списке " + names.size() + " элементов");

        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));

        names.set(0, "Mira");

        System.out.println();

        System.out.println(names.get(0));

        if (names.contains("Artem"))
            System.out.println("Список содержит объект Artem (#" + names.indexOf("Artem") +")");

        names.remove("Jora");
        names.removeFirst();
        names.removeLast();
        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));
    }
}
