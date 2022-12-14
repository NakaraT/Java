package ru.mirea.task12.number3;

public class Students {
    String student = "Student number: ";
    int id;

    @Override
    public String toString(){
        return student + id;
    }
}