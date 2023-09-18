package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 1, 3, 3, 4, 6, 7, 8, 9, 6};
        int k = 3;
        int[] res = topKFrequent(arr, k);

        System.out.println("Top " + k + " часто встречающихся элемента:");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }

    public static int[] topKFrequentStream(int[] nums, int k) {
        // Создаем поток для массива чисел
        return Arrays.stream(nums)
                // Группируем элементы по их значению и подсчитываем частоту каждого элемента
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                // Преобразуем Map<Integer, Long> в List<Map.Entry<Integer, Long>>
                .entrySet().stream()
                // Сортируем элементы по убыванию частоты и выбираем k наиболее часто встречающихся
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(k)
                // Получаем ключи (значения элементов) и преобразуем их в массив int
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }


    public static int[] topKFrequent(int[] nums, int k) {
        // Создаем HashMap для подсчета частоты каждого элемента
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Создаем приоритетную очередь (Min Heap) с помощью компаратора,
        // который сравнивает элементы на основе их частоты
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));

        // Перебираем уникальные элементы и добавляем их в приоритетную очередь
        for (int num : frequencyMap.keySet()) {
            minHeap.add(num);
            // Если размер очереди становится больше k, удаляем элемент с наименьшей частотой
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Создаем и заполняем массив результатов
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
