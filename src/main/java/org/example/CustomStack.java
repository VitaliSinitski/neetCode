package org.example;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomStack<T> {
    private T[] data;
    private int top;

    public CustomStack(int capacity) {
        data = (T[]) new Object[capacity];
        top = -1;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return data[top];
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return data[top--];
    }

    public void push(T value) {
        if (top >= data.length - 1) {
            grow();
        }
        data[++top] = value;
    }

    private void grow() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}