package org.example;

import java.util.Arrays;

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
