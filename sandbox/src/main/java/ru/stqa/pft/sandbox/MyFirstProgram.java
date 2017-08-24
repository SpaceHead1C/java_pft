package ru.stqa.pft.sandbox;

import org.w3c.dom.css.Rect;

public class MyFirstProgram {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.getLength() + " равна " + s.area());

        Rectangle r = new Rectangle(3, 7);
        System.out.println("Площадь прямоугольника со сторонами " + r.getLength() + " и " + r.getWidth() + " равна " + r.area());
    }
}