package com.liviu.lab_7.task1;

public class Triangle implements Figure {
    private double[] sides;

    public Triangle(double side1, double side2, double side3) {
        this.sides = new double[]{side1, side2, side3};
    }

    @Override
    public double getArea() {
        double semi = (sides[0]+sides[1]+sides[2])/2;
        return Math.sqrt( semi*(semi-sides[0])*(semi-sides[1])*(semi-sides[2]) );
    }

    @Override
    public double getPerimeter() {
        return sides[0]+sides[1]+sides[2];
    }
}
