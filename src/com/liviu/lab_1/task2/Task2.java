package com.liviu.lab_1.task2;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        Student student1 = new Student("Dinu",20,8);
        Student student2 = new Student("Ana",19,9);
        Student student3 = new Student("Dan",20,10);

        University university = new University("UTM",1964, Arrays.asList(student1,student2,student3));
    }
}
