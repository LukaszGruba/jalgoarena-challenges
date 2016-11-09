package com.lukgru.jalgoarena;

/**
 * Created by Lukasz on 07.11.2016.
 */
public class ListNodeBuilder {

    /**
     * List format - "1,4,5,6,23"
     * @param representation
     * @return
     */
    public ListNode listNode(String representation) {
        if (representation == null || representation.isEmpty()) {
            return null;
        }

        String[] values = representation.split(",");
        ListNode head = null;
        ListNode node = null;

        for (String value : values) {
            ListNode tmp = new ListNode(Integer.valueOf(value.trim()));
            if (node != null) {
                node.next = tmp;
            }
            else {
                head = tmp;
            }
            node = tmp;
        }
        return head;
    }

}
