package com.liviu.lab_1.task3;

import java.util.List;

public class University {

    private String name;
    private int foundationYear;
    private List<Student> students;

    public University(String name, int foundationYear, List<Student> students) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
}
