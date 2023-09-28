package org.example;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomQueueArrayV3<T> {
    private T[] data;
    private int front; // Указатель на начало очереди
    private int rear; // Указатель на конец очереди
    private int size; // Текущий размер очереди

    public CustomQueueArrayV3(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be a positive number");
        }
        data = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }


    // Получение элемента из начала очереди
    public T peek() {
        if (isEmpty()) return null;
        return (T) data[front];
    }

    // Получение элемента из начала очереди
    public T element() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return peek();
    }

    // Удаление и возврат элемента из начала очереди
    public T poll() {
        if (isEmpty()) return null;
        return dequeue();
    }

    // Удаление и возврат элемента из начала очереди
    public T remove() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return dequeue();
    }


    // Добавление элемента в конец очереди
    public boolean add(T item) {
        if (isFull()) throw new IllegalStateException("Queue is full");
        enqueue(item);
        return true;
    }

    // Добавление элемента в конец очереди
    public boolean offer(T item) {
        if (isFull()) return false;
        enqueue(item);
        return true;
    }

    // Возвращает размер очереди
    public int size() {
        return size;
    }

    // Проверка, пуста ли очередь
    public boolean isEmpty() {
        return size == 0;
    }

    private void enqueue(T item) {
        if (isFull()) grow();
        rear++;
        if (rear == data.length) {
            rear = 0; // Если достигнут конец массива, вернуться в начало
        }
        data[rear] = item;
        size++;
    }

    private T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T item = data[front];
        data[front] = null;
        front++;
        if (front == data.length) {
            front = 0; // Если достигнут конец массива, вернуться в начало
        }
        size--;
        return item;
    }


    private boolean isFull() {
        return size == data.length;
    }

    private void grow() {
        data = Arrays.copyOf(data, data.length * 2);
        front = 0;
        rear = size - 1;
    }
}