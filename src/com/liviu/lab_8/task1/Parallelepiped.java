package com.liviu.lab_8.task1;

public class Parallelepiped implements GeometricBody {
    private double[] sides;

    public Parallelepiped(double length, double width, double height) {
        this.sides = new double[]{length, width, height};
    }

    @Override
    public double getSurface() {
        return (2*(sides[0]+sides[1]) * sides[2]) + (2*sides[0]*sides[1]);
    }

    @Override
    public double getVolume() {
        return (2*sides[0]*sides[1])*sides[2];
    }
}
