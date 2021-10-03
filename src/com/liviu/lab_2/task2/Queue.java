package com.liviu.lab_2.task2;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    private List<T> list = new ArrayList<>();
    private int maxSize = -1;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
    }

    public  Queue(){ }

    public void push(T value){
        if(this.maxSize!=-1 && this.maxSize<this.list.size()){
            throw new RuntimeException(String.format("Queue size cannot exceed %d elements",this.maxSize));
        }
        list.add(value);
    }

    public T pop(){
        T result = this.list.get(0);
        this.list.remove(0);
        return result;
    }
}
