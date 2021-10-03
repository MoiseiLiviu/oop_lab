package com.liviu.lab_2.task3;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    private List<T> list = new ArrayList<>();
    private int maxSize = -1;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
    }

    public Queue(){ }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public boolean isFull() {
        if (maxSize == -1) return false;
        return this.list.size() == maxSize;
    }

    public void push(T value) {
        if (this.maxSize != -1 && this.maxSize < this.list.size()) {
            throw new RuntimeException(String.format("Queue size cannot exceed %d elements", this.maxSize));
        }
        list.add(value);
    }

    public T pop() {
        T result = this.list.get(0);
        this.list.remove(0);
        return result;
    }
}
