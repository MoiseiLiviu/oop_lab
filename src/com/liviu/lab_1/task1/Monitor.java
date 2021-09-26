package com.liviu.lab_1.task1;

public class Monitor implements Comparable<Monitor>{

    private String color;
    private float diagonal;
    private String resolution;

    public Monitor(String color, float diagonal, String resolution) {
        this.color = color;
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    @Override
    public int hashCode(){
        return resolution.length()*20+(int)diagonal%4;
    }

    @Override
    public boolean equals(Object object){
        if(object instanceof Monitor){
            Monitor monitor = (Monitor) object;
            return (this.color.equals(monitor.color)
            &&this.diagonal == monitor.diagonal
            &&this.resolution.equals(monitor.resolution));
        } return false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public int compareTo(Monitor o) {
        return Float.compare(this.diagonal, o.diagonal);
    }
}
