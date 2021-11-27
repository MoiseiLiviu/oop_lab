package com.liviu.lab_7.task2;

import lab7.task1.Figure;
import lab7.task1.Rectangle;
import lab7.task1.Square;
import lab7.task1.Triangle;

public class Task2 {
    public static void main(String[] args) {
        Square s = new Square(3);
        Rectangle r = new Rectangle(3, 5);
        Triangle t = new Triangle(3, 5, 7);

        Figure[] figures = {s, r, t};
        System.out.println("Task 2:\nBiggest area = "+FigureController.getBiggestArea(figures)+"\n" +
                "Biggest Perimeter = "+FigureController.getBiggestPerimeter(figures));
    }
}
