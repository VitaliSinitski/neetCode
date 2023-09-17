package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContainsDuplicate {
    public static void main(String[] args) {
//        Integer[] nums = new Integer[]{1,1,1,3,3,4,3,2,4,2};
        Integer[] nums = new Integer[]{1, 2, 3, 4};
//        Integer[] nums = new Integer[]{1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
        System.out.println();
        System.out.println(containsDuplicateHash(nums));
    }

    public static boolean containsDuplicateHash(Integer[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            boolean result = numbers.add(nums[i]);
            System.out.println(nums[i] + ":" + result);
            if (!result) return true;
        }
        System.out.println(numbers);
        return false;
    }

    public static boolean containsDuplicate(Integer[] nums) {
        Integer[] sortedNums = Arrays.stream(nums).sorted().toArray(Integer[]::new);
        System.out.println(sortedNums);
        for (int i = 0; i < sortedNums.length - 1; i++) {
            if (sortedNums[i] == sortedNums[i + 1]) {
                System.out.println("true");
                return true;
            }
        }
        return false;
    }
}