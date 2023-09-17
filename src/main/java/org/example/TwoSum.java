package org.example;

import java.util.Arrays;

/*
 * 1. Two Sum
 * Easy
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums;
        int target;
//        nums = new int[]{2,7,11,15};
//        target = 9;
//        nums = new int[]{3,2,4};
//        target = 6;
        nums = new int[]{3, 3, 11, 11, 2, 5, 7, 2, 4, 9, 1, 3, 5, 6};
        target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println();
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int mid = target - nums[i];
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] == mid && i != j) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static int[] twoSum2(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}
