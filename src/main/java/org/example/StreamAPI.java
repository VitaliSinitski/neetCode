package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StreamAPI {
    public static void main(String[] args) {
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int[] numbers2 = {-2, 5, 6, 2, 8, 1, 2, 3, 0, -4, -2, 8, 4, 2, 3, 5, 1};
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид", "Париж");
//        Arrays.stream(numbers).filter(value -> value > 0).forEach(System.out::println);
//        Arrays.stream(numbers2).sorted().distinct().forEach(System.out::println);
        cities.stream().filter(s -> s.length() == 5).forEach(System.out::println);

    }
}
