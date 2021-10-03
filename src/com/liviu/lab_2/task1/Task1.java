package com.liviu.lab_2.task1;

public class Task1 {

    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(3);
        Box box3 = new Box(1,2,3);

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
    }
}
