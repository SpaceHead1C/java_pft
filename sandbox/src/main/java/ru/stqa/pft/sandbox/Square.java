package ru.stqa.pft.sandbox;

/**
 * Created by Андрей on 24.08.2017.
 */
public class Square {
    private double l;

    public Square(double l) {
        this.l = l;
    }

    public double area() {
        return l * l;
    }

    public double getLength() {
        return l;
    }
}
