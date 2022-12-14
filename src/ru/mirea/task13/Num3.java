package ru.mirea.task13;

public class Num3<T> {
    private final int INIT_SIZE = 1;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    public void add(T item) {
        if (pointer == array.length - 1)
            resize(array.length + 1);
        array[pointer++] = item;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
    }

    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public static void main(String[] args) {
        Num3<String> names = new Num3<String>();

        names.add("Vyacheslav");
        names.add("Roman");
        names.add("Jora");
        names.add("Andrei");
        names.add("Korpalo");
        names.add("Artem");

        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));

        System.out.println("");

        System.out.println("В списке " + names.size() + " элементов");

        names.remove(0);

        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));
    }
}
