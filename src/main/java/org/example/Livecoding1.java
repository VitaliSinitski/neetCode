package org.example;

public class Livecoding1 {
    public static void main(String[] args) {

    }

    // increese siz

    // push - добавление
    // pop - берет
    // peek - берет без удаления


    class CustomStack {
        int capacity = 10;
        int head = -1;
        int tail;
        String[] strings = new String[10];

        public void push(String s) {
            strings[head] = s;
            head++;
        }
    }
}
