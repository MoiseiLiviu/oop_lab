package com.liviu.lab_7.task2;

import lab7.task1.Figure;

public class FigureController {
    public static double getBiggestArea(Figure[] figures){
        double maxArea = -1;
        for (Figure f: figures) {
            if(f.getArea()>maxArea)
                maxArea=f.getArea();
        }
        return maxArea;
    }

    public static double getBiggestPerimeter(Figure[] figures){
        double maxPeri = -1;
        for (Figure f: figures) {
            if(f.getPerimeter()>maxPeri)
                maxPeri=f.getPerimeter();
        }
        return maxPeri;
    }
}
