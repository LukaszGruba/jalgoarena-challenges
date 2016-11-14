package com.lukgru.jalgoarena.medium;

import com.lukgru.jalgoarena.ListNode;

/**
 * Implement method kthToLast with algorithm to find the kth to last element of a singly linked list.
 Examples
 1->2->3->4->5->6, 3 -> 3
 Notes
 If index is absent, return 0.


 12,1,2,2,3,3,4,4,3,1,    1
10,1,2,2,3,3,4,4,3,6,    8
13,1,1,1,2,3,4,3,3,    100
101,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,    219
11,1,2,2,3,3,4,4,3,6,    -1
1,2,3,4,5,6,    3

 */
public class ReturnKthToLast {

    //FIXME: something is not working
    public int kthToLast(ListNode head, int k) {
        ListNode node = head;
        if (k < 0) return 0;
        int[] lastValues = new int[k];
        int i = 0;
        boolean b = false;
        while (head != null) {
            lastValues[i] = head.value;
            b = b || i + 1 == k;
            i = (i + 1) % k;
            head = head.next;
        }
        return b ? lastValues[i] : 0;
    }

}
