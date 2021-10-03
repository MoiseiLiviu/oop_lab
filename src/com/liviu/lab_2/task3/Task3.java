package com.liviu.lab_2.task3;

public class Task3 {

    public static void main(String[] args) {

        Box box = new Box(2, 3, 4);
        System.out.println(box.getBoxArea());
        System.out.println(box.getBoxVolume());

        Queue<Integer> queue = new Queue<>(2);
        System.out.println(queue.isEmpty());

        queue.push(1);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.push(2);
        System.out.println(queue.isFull());
    }
}
