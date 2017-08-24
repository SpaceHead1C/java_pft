package ru.stqa.pft.sandbox;

/**
 * Created by Андрей on 24.08.2017.
 */
public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public double getLength() {
        return a;
    }

    public double getWidth() {
        return b;
    }
}
