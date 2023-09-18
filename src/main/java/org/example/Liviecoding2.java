package org.example;

import com.sun.source.doctree.SeeTree;
import java.util.HashMap;

/**
 *         int[] arr = {4, 1, 3, 1, 3, 3, 4, 6, 7, 8, 9, 6};
 *         int k = 3;
 *         int[] res = topKFrequent(arr, k);
 */

public class Liviecoding2 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 1, 3, 3, 4, 6, 7, 8, 9, 6};
    }

    public static int[] top(int[] nums, int quantity) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(nums[i])) {
                numbers.replace(nums[i], numbers.get(nums[i])+1);
            } else {
            numbers.put(nums[i], 1);
            }
        }
        // стримы
        // сортировк
        return null;
    }
}
