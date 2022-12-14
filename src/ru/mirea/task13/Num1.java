package ru.mirea.task13;

import java.util.*;

public class Num1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
//
        names.add("Vyacheslav");
        names.add("Roman");
        names.add("Jora");
        names.add("Andrei");
        names.add("Korpalo");
        names.add("Artem");

        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));

        System.out.println("");

        names.set(1, "New name");
        System.out.println(names.get(1));

        System.out.println("В списке " + names.size() + " элементов");

        if (names.contains("Vyacheslav"))
            System.out.println("Список содержит объект Vyacheslav (#" + names.indexOf("Vyacheslav") +")");

        names.remove(1);
        names.remove("Roman");

        System.out.println("");

        Collections.sort(names);
        Collections.reverse(names);

        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));

        System.out.println("");

        Object[] name = names.toArray();
        for (int i = 0; i < name.length; i++)
            System.out.println(name[i]);
    }
}
