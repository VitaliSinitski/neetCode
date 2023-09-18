package org.example;

import java.util.EmptyStackException;

public class CustomStackNode<T> {
    private Node<T> top;
    private Node<T> tail;

    // Вложенный класс для узла списка
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    // Метод для добавления элемента в вершину стека
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        if (tail == null) {
            tail = newNode; // Если стек пуст, устанавливаем tail на новый элемент
        }
    }

    // Метод для удаления элемента из вершины стека и его возврата
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.data;
        top = top.next;
        if (top == null) {
            tail = null; // Если удаляем последний элемент, обнуляем tail
        }
        return value;
    }

    // Метод для просмотра элемента на вершине стека
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return top == null;
    }

    // Метод для получения последнего элемента
    public T getLast() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return tail.data;
    }
}

