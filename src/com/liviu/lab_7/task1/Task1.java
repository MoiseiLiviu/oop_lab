package com.liviu.lab_7.task1;

public class Task1 {
    public static void main(String[] args) {
        Square s = new Square(3);
        Rectangle r = new Rectangle(3, 5);
        Triangle t = new Triangle(3, 5, 7);

        Figure[] figures = {s, r, t};

        System.out.println("Task 1:\n" +
                "Square Area = "+ figures[0].getArea()+";\t Square Perimeter = "+figures[0].getPerimeter()+"\n"+
                "Rectangle Area = "+ figures[1].getArea()+";\t Rectangle Perimeter = "+figures[1].getPerimeter()+"\n"+
                "Triangle Area = "+ figures[2].getArea()+";\t Triangle Perimeter = "+figures[2].getPerimeter());
    }
}
