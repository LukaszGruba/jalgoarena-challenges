package com.lukgru.jalgoarena;

/**
 * Created by Łukasz on 2016-11-05.
 */
public class ListNode {

    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
