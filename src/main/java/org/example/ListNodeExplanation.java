package org.example;

public class ListNodeExplanation {
    public static void main(String[] args) {
        // Создаем массив чисел
        int[] nums = {1, 2, 3, 4, 5};

        // Создаем односвязный список из массива чисел
        ListNode head = createLinkedList(nums);

        System.out.println("Исходный список:");
        printList(head);

        // Итеративный способ: инвертируем список и выводим его
        ListNode reversedIterative = reverseListIterative(head);
        System.out.println("Инвертированный список (итеративный способ):");
        printList(reversedIterative);

        // Создаем новый односвязный список из массива чисел
        ListNode head2 = createLinkedList(nums);

        // Рекурсивный способ: инвертируем список и выводим его
        ListNode reversedRecursive = reverseListRecursive(head2);
        System.out.println("Инвертированный список (рекурсивный способ):");
        printList(reversedRecursive);
    }

    // Вспомогательный метод для создания односвязного списка из массива чисел
    public static ListNode createLinkedList(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        // Создаем фиктивный узел (dummy node) для упрощения кода
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Проходим по массиву чисел и создаем узлы списка
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }

        // Возвращаем начало списка, пропуская фиктивный узел
        return dummy.next;
    }

    // Вспомогательный метод для вывода односвязного списка
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static ListNode reverseListRecursive(ListNode head) {
        return reverseListRecursiveHelper(head, null);
    }

    private static ListNode reverseListRecursiveHelper(ListNode current, ListNode prev) {
        if (current == null) {
            return prev;
        }

        ListNode next = current.next;
        current.next = prev;

        return reverseListRecursiveHelper(next, current);
    }
}
