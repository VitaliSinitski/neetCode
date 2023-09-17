package org.example;

/*
 * 704. Binary Search
 * Easy
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 < nums[i], target < 104
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums;
        int target;
//        nums = new int[]{-1, 0, 3, 5, 9, 12};
        nums = new int[]{5};
        target = 5;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int middleIndex;
        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (nums[middleIndex] == target) {
                return middleIndex;
            }
            if (nums[middleIndex] > target) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }

    /*
     * Рассмотрим алгоритм двоичного поиска по отсортированному массиву в Java:
     *
     * 1. Задается отсортированный массив элементов.
     *
     * 2. Устанавливаются начальные значения переменных `low` и `high`.
     * `low` устанавливается на начальную позицию массива (например, 0), а `high` устанавливается на конечную позицию (например, `array.length - 1`).
     *
     * 3. Начинается цикл `while`, который продолжается до тех пор, пока `low` не превысит `high`.
     *
     * 4. Внутри цикла вычисляется средний индекс `mid` с помощью формулы `int mid = low + (high - low) / 2`.
     *
     * 5. Выполняется проверка, равно ли значение `target` элементу массива `array[mid]`.
     * Если это так, значит, искомый элемент найден, и возвращается значение `mid`.
     *
     * 6. Если `target` меньше `array[mid]`, то значение `high` обновляется на `mid - 1`, чтобы сузить диапазон поиска до левой половины массива.
     *
     * 7. Если `target` больше `array[mid]`, то значение `low` обновляется на `mid + 1`, чтобы сузить диапазон поиска до правой половины массива.
     *
     * 8. Если ни одно из условий не выполняется, то искомый элемент отсутствует в массиве, и возвращается значение -1.
     *
     * 9. Поиск продолжается до тех пор, пока не будет найден искомый элемент или пока диапазон поиска не сократится до пустого диапазона.
     *
     * 10. Если весь цикл `while` пройден, искомый элемент не найден, и возвращается значение -1.
     */
}
