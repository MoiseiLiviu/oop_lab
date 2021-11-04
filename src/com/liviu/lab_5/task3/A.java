package com.liviu.lab_5.task3;

public class A {

    protected String a="a";
    protected X x = new X("xxx");

    public A(String a) {
        this.a = a;
        this.x = x;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
