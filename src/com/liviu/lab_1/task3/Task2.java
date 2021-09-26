package com.liviu.lab_1.task3;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        Student student1 = new Student("Dinu",20,8);
        Student student2 = new Student("Ana",19,9);
        Student student3 = new Student("Dan",20,10);

        University university1 = new University("UTM",1964, Arrays.asList(student1,student2,student3));

        Student student4 = new Student("Nastea",20,8);
        Student student5 = new Student("Irina",19,5);
        Student student6 = new Student("Ion",20,7);

        University university2 = new University("ASEM",404,Arrays.asList(student4,student5,student6));

        Student student7 = new Student("Marin",20,6);
        Student student8 = new Student("Diana",19,6);
        Student student9 = new Student("Felicia",20,6);

        University university3 = new University("ULIM",404,Arrays.asList(student7,student8,student9));

        //Calculates average of student marks for all universities
        Arrays.asList(university1,university2,university3).forEach(university ->
                university.getStudents().stream().mapToInt(Student::getMark).average().ifPresent(System.out::println));
    }
}
