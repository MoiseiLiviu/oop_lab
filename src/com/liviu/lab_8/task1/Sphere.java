package com.liviu.lab_8.task1;

public class Sphere implements GeometricBody {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double getVolume() {
        return (4*Math.PI*radius*radius*radius)/3;
    }
}
