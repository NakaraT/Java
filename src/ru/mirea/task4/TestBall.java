package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball a1 = new Ball(6.3,10.5);
        Ball a2 = new Ball();
        a1.getX();
        a1.getY();
        a1.setX(10);
        a1.setY(2.5);
        a1.move(9.8,17.9);
        System.out.println(a1.toString());
    }
}