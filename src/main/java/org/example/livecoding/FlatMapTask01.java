package org.example.livecoding;

import java.util.List;

public class FlatMapTask01 {
    public static void main(String[] args) {
        List.of("a", "b", "c").stream()
                .map(letter -> {
                    System.out.println(letter.toUpperCase());
                    return letter.toUpperCase();
                }).map(letter -> {
                    System.out.println(letter + 1);
                    return letter + 1;
                }).toList();
    }
}
