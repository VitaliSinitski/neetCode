package org.example;

import java.util.NoSuchElementException;

public class CustomQueueArrayV1<T> {

    private T[] data;
    private int front;
    private int rear;
    private int size;

    public CustomQueueArrayV1(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be a positive number");
        }
        data = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public T peek() {
        if (isEmpty()) return null;
        return data[front];
    }

    public T element() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return peek();
    }

    public T poll() {
        if (isEmpty()) return null;
        return dequeue();
    }

    public T remove() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return dequeue();
    }

    public boolean add(T item) {
        if (isFull()) throw new IllegalStateException("Queue is full");
        enqueue(item);
        return true;
    }

    public boolean offer(T item) {
        if (isFull()) return false;
        enqueue(item);
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void enqueue(T item) {
        if (isFull()) {
            // Если очередь полна, увеличиваем ее размер
            grow();
        }
        rear++;
        data[rear] = item;
        size++;
    }

    private T dequeue() {
        T item = data[front];
        data[front] = null;
        front++;
        size--;
        return item;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void grow() {
        // Увеличиваем размер массива вдвое
        T[] newData = (T[]) new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[front + i];
        }
        data = newData;
        front = 0;
        rear = size - 1;
    }
}
