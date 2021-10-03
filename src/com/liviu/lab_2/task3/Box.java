package com.liviu.lab_2.task3;

public class Box {

    private int width;
    private int depth;
    private int height;

    public Box(){
        this.depth = 1;
        this.height = 1;
        this.width = 1;
    }

    public Box(int value){
        this.depth = value;
        this.width = value;
        this.height = value;
    }

    public Box(int height, int width, int depth){
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    public int getBoxVolume(){

        return this.depth * this.height * this.depth;
    }

    public int getBoxArea(){

        return 2*(this.height*this.depth + this.height*this.width + this.width*this.depth);
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", depth=" + depth +
                ", height=" + height +
                '}';
    }
}
