package org.example;

import java.util.EmptyStackException;

public class CustomStackArray {
    private int[] data;
    private int top;

    public CustomStackArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top >= data.length - 1) {
            // Если массив заполнен, вызываем метод для увеличения его размера
            grow();
        }
        data[++top] = value;
    }

    public int pop() {
        if (top >= 0) {
            return data[top--];
        }
        throw new EmptyStackException();
    }

    public int peek() {
        if (top >= 0) {
            return data[top];
        }
        throw new EmptyStackException();
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void grow() {
        int newCapacity = data.length * 2; // Увеличиваем размер массива в два раза
        int[] newData = new int[newCapacity];

        // Копируем элементы из текущего массива в новый
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData; // Заменяем текущий массив на новый
    }
}

