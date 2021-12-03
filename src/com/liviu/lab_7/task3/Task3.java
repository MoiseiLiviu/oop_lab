package com.liviu.lab_7.task3;


import com.liviu.lab_7.task1.Figure;
import com.liviu.lab_7.task1.Rectangle;
import com.liviu.lab_7.task1.Square;
import com.liviu.lab_7.task1.Triangle;
import com.liviu.lab_7.task2.FigureController;

public class Task3 {
    public static void main(String[] args) {
        Figure circle = new Figure(){
            private double radius = 3;

            public double getArea(){
                return Math.PI*radius*radius;
            }

            public double getPerimeter(){
                return 2*Math.PI*radius;
            }
        };
        System.out.println("Task 3:\n" +
                "Circle Area = "+ circle.getArea()+";\t Circle Perimeter = "+circle.getPerimeter());

        Square s = new Square(3);
        Rectangle r = new Rectangle(3, 5);
        Triangle t = new Triangle(3, 5, 7);

        Figure[] figures = {s, r, t, circle};
        System.out.println("Task 2:\nBiggest area = "+ FigureController.getBiggestArea(figures)+"\n" +
                "Biggest Perimeter = "+FigureController.getBiggestPerimeter(figures));
    }
}
