package com.liviu.lab_8.task1;

public class Task1 {
    public static void main(String[] args) {
        Cub s = new Cub(3);
        Sphere r = new Sphere(3);
        Parallelepiped t = new Parallelepiped(3, 5, 7);

        GeometricBody[] figures = {s, r, t};

        System.out.println("Task 1:\n" +
                "Cub Surface = "+ figures[0].getSurface()+";\t Cub Volume = "+figures[0].getVolume()+"\n"+
                "Sphere Surface = "+ figures[1].getSurface()+";\t Sphere Volume = "+figures[1].getVolume()+"\n"+
                "Parallelepiped Surface = "+ figures[2].getSurface()+";\t Parallelepiped Volume = "+figures[2].getVolume());
    }
}
