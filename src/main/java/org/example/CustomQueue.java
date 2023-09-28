package org.example;

import java.util.NoSuchElementException;

public class CustomQueue<T> {
    private Object[] array;
    private int front;
    private int rear;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomQueue(int capacity) {
        array = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public CustomQueue() {
        this(DEFAULT_CAPACITY);
    }

    public boolean add(T item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % array.length;
        array[rear] = item;
        size++;
        return true;
    }

    public boolean offer(T item) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % array.length;
        array[rear] = item;
        size++;
        return true;
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T item = (T) array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size--;
        return item;
    }

    public T poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return (T) array[front];
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return (T) array[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T item) {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % array.length;
            if (array[index] != null && array[index].equals(item)) {
                return true;
            }
        }
        return false;
    }

    private boolean isFull() {
        return size == array.length;
    }
}

