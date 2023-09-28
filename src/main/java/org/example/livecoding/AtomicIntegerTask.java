package org.example.livecoding;

public class AtomicIntegerTask {
    static int value = 0;
    public static void main(String[] args) {
        for (int i = 0; 1 < 1000; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    value++;
                }
            }).start();
        }
        System.out.println(value);
    }
}