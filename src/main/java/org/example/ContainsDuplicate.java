package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 217. Contains Duplicate
 * Easy
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */

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