package ru.mirea.task3;

public class Circle {
    private final double pi = 3.14;
    private int r;
    public Circle(int r) {
        this.r = r;
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    public int getD(){
        return r * 2;
    }
    public double getS(){
        return pi * (Math.pow(r, 2));
    }
    public double getC(){
        return 2 * pi * r;
    }
}
