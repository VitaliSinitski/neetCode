package org.example;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomQueueArrayV5<T> {
    private T[] data;
    private int front; // Указатель на начало очереди
    private int rear; // Указатель на конец очереди
    private int size; // Текущий размер очереди

    public CustomQueueArrayV5(int capacity) {
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

    // Проверка наличия элемента в очереди
//    public boolean contains(T item) {
//        for (int i = 0; i < size; i++) {
//            int index = (front + i) % data.length;
//            if (data[index] != null && data[index].equals(item)) {
//                return true;
//            }
//        }
//        return false;
//    }

    /**
     * Добавляет элемент в конец очереди.
     * Если текущий размер очереди равен ее текущей емкости,
     * вызывает метод grow() для увеличения емкости.
     * Затем перемещает указатель rear и добавляет элемент в новую позицию.
     * Увеличивает размер очереди на 1.
     *
     * @param item Элемент, который нужно добавить в очередь.
     */
    private void enqueue(T item) {
        if (size == data.length) {
            grow(); // Если очередь полна, увеличиваем ее емкость.
        }
        rear = (rear + 1) % data.length; // Перемещаем указатель rear.
        data[rear] = item; // Добавляем элемент в конец очереди.
        size++; // Увеличиваем размер очереди на 1.
    }

    /**
     * Удаляет и возвращает элемент из начала очереди.
     * Этот метод извлекает элемент из начала очереди, перемещает указатель front,
     * освобождает память, занимаемую удаленным элементом, и уменьшает размер очереди на 1.
     *
     * @return Элемент, извлеченный из начала очереди.
     */
    private T dequeue() {
        T item = (T) data[front]; // Получаем элемент из начала очереди.
        data[front] = null; // Освобождаем память, занимаемую удаленным элементом.
        front = (front + 1) % data.length; // Перемещаем указатель front.
        size--; // Уменьшаем размер очереди на 1.
        return item; // Возвращаем удаленный элемент.
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

