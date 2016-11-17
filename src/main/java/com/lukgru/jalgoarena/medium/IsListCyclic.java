package com.lukgru.jalgoarena.medium;

import com.lukgru.jalgoarena.ListNode;

import java.util.*;

/**
 * Given a singly linked list, write a method isCyclic to check if the list has cycles.
 * The space complexity can be O(n).
 * If there is a cycle, return true otherwise return false.
 * Empty lists should be considered non-cyclic.
 *
 * Examples
 * 1->2->3->4->5->6->1 -> true
 */
public class IsListCyclic {

    public boolean isCyclic(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        int last = node.value;
        node = head;
        while (node.next != null) {
            if (node.value == last) return true;
            node = node.next;
        }
        return false;
    }

}
