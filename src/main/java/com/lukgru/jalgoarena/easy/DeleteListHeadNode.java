package com.lukgru.jalgoarena.easy;

import com.lukgru.jalgoarena.ListNode;

/**
 * Delete List Head Node  Problem Ranking
 Given a singly linked list, write a method deleteAtHead to delete its head node and return the new head.
 Examples
 1->2->3->4->5->6 -> 2->3->4->5->6
 */
public class DeleteListHeadNode {

    public ListNode deleteAtHead(ListNode head) {
        return head != null ? head.next : null;
    }

}
