package com.liviu.lab_1.task1;

public class Task1 {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("yellow",25.5f,"1980x1080");
        monitor1.setColor("red");
        monitor1.setDiagonal(27f);

        Monitor monitor2 = new Monitor("red",27,"1980x1080");

        System.out.println(monitor1.equals(monitor2));
        System.out.println(monitor1.compareTo(monitor2));
    }
}
