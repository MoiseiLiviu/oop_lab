package com.liviu.lab_8.task2;


import com.liviu.lab_8.task1.Cub;
import com.liviu.lab_8.task1.GeometricBody;
import com.liviu.lab_8.task1.Parallelepiped;
import com.liviu.lab_8.task1.Sphere;

public class Task2 {
    public static void main(String[] args) {
        Cub s = new Cub(3);
        Sphere r = new Sphere(3);
        Parallelepiped t = new Parallelepiped(3, 5, 7);

        GeometricBody[] figures = {s, r, t};
        System.out.println("Task 2:\nBiggest Volume = "+ GeometricBodyController.getBiggestVolume(figures)+"\n" +
                "Biggest Surface = "+ GeometricBodyController.getBiggestSurface(figures));
    }
}
