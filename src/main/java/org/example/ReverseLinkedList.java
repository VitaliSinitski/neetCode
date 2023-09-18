package org.example;

/**
 * 206. Reverse Linked List
 * Easy
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * ///
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * ///
 * Example 2:
 * Input: head = [1,2]
 * Output: [2,1]
 * ///
 * Example 3:
 * Input: head = []
 * Output: []
 * ///
 * Constraints:
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 *  ///
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head;
//        head = 1,2,3,4,5;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//    public ListNode reverseListIteratively(ListNode head) {
//        for (int i = 0; i < hea; i++) {
//
//        }
//    }
//
//    public ListNode reverseListRecursively(ListNode head) {
//
//    }

//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) return head;
//        // Create a new node to call the function recursively and we get the reverse linked list...
//        ListNode res = reverseList(head.next);
//        // Set head node as head.next.next...
//        head.next.next = head;
//        //set head's next to be null...
//        head.next = null;
//        return res;     // Return the reverse linked list...
//    }

    public ListNode reverseList(ListNode head) {
        // Инициализируем три указателя: prev (предыдущий), cur (текущий), и temp (временный).
        ListNode prev = null; // Изначально предыдущий элемент равен null, так как это будет последний элемент в инвертированном списке.
        ListNode cur = head; // Текущий элемент начинается с головы исходного списка.
        ListNode temp = null; // Временный элемент будет использоваться для сохранения следующего элемента перед изменением ссылок.

        while (cur != null) {
            // Сохраняем ссылку на следующий элемент во временной переменной (temp).
            temp = cur.next;

            // Меняем направление ссылки текущего элемента, чтобы он указывал на предыдущий элемент.
            cur.next = prev;

            // Перемещаем указатели вперед: prev становится текущим элементом, а cur становится следующим элементом.
            prev = cur;
            cur = temp;
        }

        // После завершения цикла голова (head) становится равной последнему элементу (prev), который теперь является новой головой инвертированного списка.
        head = prev;

        // Возвращаем новую голову инвертированного списка.
        return head;
    }


}
