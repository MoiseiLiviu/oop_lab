package com.liviu.lab_2.task2;

public class Task2 {

    public static void main(String[] args) {
        Queue<Integer> queue1 = new Queue<>();
        Queue<String> queue2 = new Queue<>(4);

        queue1.push(1);
        queue1.push(2);
        queue1.push(3);

        queue2.push("One");
        queue2.push("Two");
        queue2.push("Three");

        System.out.println(queue1.pop());
        System.out.println(queue2.pop());
    }
}
