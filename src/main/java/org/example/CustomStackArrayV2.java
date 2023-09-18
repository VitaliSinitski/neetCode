package org.example;

import java.util.EmptyStackException;

public class CustomStackArrayV2 {
    private int[] data;
    private int top;
    private int tail;

    public CustomStackArrayV2(int capacity) {
        data = new int[capacity];
        top = -1;
        tail = 0; // Изначально конец стека находится в начале массива
    }

    public void push(int value) {
        if (top < data.length - 1) {
            data[++top] = value;
        } else {
            // Если массив заполнен, вызываем метод для увеличения его размера
            grow();
            data[++top] = value;
        }
    }

    public int pop() {
        if (top >= tail) {
            return data[top--];
        }
        throw new EmptyStackException();
    }

    public int peek() {
        if (top >= tail) {
            return data[top];
        }
        throw new EmptyStackException();
    }

    public boolean isEmpty() {
        return top < tail;
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

