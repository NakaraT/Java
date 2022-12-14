package ru.mirea.task25;

abstract class ShapeDecorator {
    Shape shape;

    public ShapeDecorator(Shape shape) { this.shape = shape; }
    public abstract void draw();
}

class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) { super(shape); }

    public void draw() { shape.draw(); }

    void setRedBorder() { System.out.println("Red border"); }
}


interface Shape {
    public void draw();
}

class Circle implements Shape {
    public void draw() { System.out.println("Circle"); }
}

class Rectangle implements Shape {
    public void draw() { System.out.println("Rectangle"); }
}

public class Decorator {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        RedShapeDecorator rsd = new RedShapeDecorator(r);
        rsd.setRedBorder();
        rsd.draw();

        System.out.println();

        Shape c = new Circle();
        RedShapeDecorator csd = new RedShapeDecorator(c);
        csd.setRedBorder();
        csd.draw();
    }
}