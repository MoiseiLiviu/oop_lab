package com.liviu.lab_8.task1;

public class Cub implements GeometricBody {
    private double side;

    public Cub(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return 6*side*side;
    }

    @Override
    public double getVolume() {
        return side*side*side;
    }
}
