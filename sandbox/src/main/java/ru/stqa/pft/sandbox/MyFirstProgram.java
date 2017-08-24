package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l));

        double a = 3;
        double b = 7;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a, b));
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}