package org.example;

public class Matrix10 {
    public static void main(String[] args) {
        int[][] nums = new int[10][10];
        arrayFill(nums);
        arrayPrint(nums);

    }

    public static void findObject(int[] nums, int object) {

    }

    public static void arrayFill(int[][] nums) {
        int counter = 1;
        for (int x = 0; x < nums.length; x++) {
            for (int y = 0; y < nums.length; y++) {
                nums[x][y] = counter++;
            }
        }
    }

    public static void arrayPrint(int[][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }
}
