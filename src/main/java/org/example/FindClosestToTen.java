package org.example;

// int a =  findClosestToTen(new int[] {-5, -1, 7, 10, 11, 78});

public class FindClosestToTen {
    public static void main(String[] args) {
//        int[] nums = {-5, -1, 7, 10, 11, 78};
//        int[] nums = {-5, -1, 7, 21, 78};
        int[] nums = {-5};
        int target = 10;
        System.out.println(findClosestToTen(nums, target));
        System.out.println(findClosestNum(nums, target));
    }


    public static Integer findClosestToTen(int[] nums, int target) {
        if (nums == null || nums.length == 0) return null;
        int closest = nums[0];
        int minDiff = Math.abs(target - closest);
        for (int i = 1; i < nums.length; i++) {
            int diff = Math.abs(target - nums[i]);
            if (diff < minDiff) {
                closest = nums[i];
                minDiff = diff;
            }
        }
        return closest;
    }


    public static Integer findClosestNum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return null;
        int closest = nums[0];
        int minDiff = Math.abs(target - closest);
        for (int i = 1; i < nums.length; i++) {
            int diff = Math.abs(target - nums[i]);
            if (diff < minDiff) {
                minDiff = diff;
                closest = nums[i];
            }
        }
        return closest;
    }

//    public static int findClosestToTen(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            throw new IllegalArgumentException("Массив пустой");
//        }
//        int closest = arr[0];
//        int minDiff = Math.abs(10 - closest); // Переменная для хранения минимальной разницы с 10
//
//        // Проход по массиву, начиная с индекса 1 (первый элемент уже использован)
//        for (int i = 1; i < arr.length; i++) {
//            int diff = Math.abs(10 - arr[i]); // Вычисление разницы между текущим элементом и 10
//
//            // Если текущая разница меньше минимальной, обновляем closest и minDiff
//            if (diff < minDiff) {
//                closest = arr[i]; // Обновляем ближайший элемент
//                minDiff = diff;   // Обновляем минимальную разницу
//            }
//        }
//
//        // Возвращаем ближайший к 10 элемент
//        return closest;
//    }

    /**
     * Строка int minDiff = Math.abs(10 - closest); использует метод Math.abs() для вычисления
     * абсолютной разницы между числом 10 и текущим элементом closest.
     *
     * Абсолютное значение (или модуль) числа - это его числовая величина без учета его знака.
     * То есть, если у нас есть число -5, то абсолютное значение этого числа равно 5.
     * Если у нас есть число 10, то абсолютное значение остается 10.
     *
     * В данной задаче мы хотим найти ближайший элемент из массива к числу 10.
     * Это может быть как элемент справа от 10, так и элемент слева от 10.
     * Но разница между числом 10 и ближайшим элементом может быть положительной
     * (если ближайший элемент больше 10) или отрицательной (если ближайший элемент меньше 10).
     *
     * Чтобы получить абсолютную разницу между числом 10 и ближайшим элементом,
     * мы используем Math.abs(10 - closest).
     * Это гарантирует, что результат всегда будет положительным числом,
     * представляющим расстояние между 10 и ближайшим элементом вне зависимости от того, больше ли 10 или меньше.
     * Мы используем абсолютное значение, потому что нам важна только числовая разница,
     * а не ее направление (положительное или отрицательное).
     */


}
