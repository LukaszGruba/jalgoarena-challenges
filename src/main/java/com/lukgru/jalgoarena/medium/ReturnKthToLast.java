package com.lukgru.jalgoarena.medium;

import com.lukgru.jalgoarena.ListNode;

/**
 * Implement method kthToLast with algorithm to find the kth to last element of a singly linked list.
 Examples
 1->2->3->4->5->6, 3 -> 3
 Notes
 If index is absent, return 0.
 */
public class ReturnKthToLast {

    public int kthToLast2(ListNode head, int k) {
        if (k++ < 0) return 0;
        int[] lastValues = new int[k];
        int i = 0;
        int counter = 0;
        while (head != null) {
            lastValues[i] = head.value;
            counter++;
            i = ++i % k;
            head = head.next;
        }
        return counter != i ? lastValues[i] : 0;
    }

    public int kthToLast(ListNode head, int k) {
        ListNode node = head;
        if (k < 0) return 0;
        if (k == 0) return head.value;

        int counter = 0;
        while (node != null) {
            node = node.next;
            counter++;
        }

        node = head;
        int i = 0;
        int index = counter - k - 1;
        if (index < 0) return 0;
        while (i < index) {
            i++;
            node = node.next;
        }
        return node.value;
    }

}
