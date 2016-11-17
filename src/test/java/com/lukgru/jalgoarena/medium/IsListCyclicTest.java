package com.lukgru.jalgoarena.medium;

import com.lukgru.jalgoarena.ListNode;
import com.lukgru.jalgoarena.ListNodeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-15.
 */
public class IsListCyclicTest {

    private IsListCyclic isListCyclic = new IsListCyclic();

    private ListNodeBuilder listNodeBuilder = new ListNodeBuilder();

    @Test
    public void givenListWithRepeatedElementButNotCycleReturnFalse() {
        //given
        String representation = "1,2,3,4,5,3,6";
        ListNode head = listNodeBuilder.listNode(representation);

        //when
        boolean cyclic = isListCyclic.isCyclic(head);

        //then
        assertTrue(cyclic);
    }

    @Test
    public void givenTwoElementListWithoutCyclesReturnFalse() {
        //given
        String representation = "1,2";
        ListNode head = listNodeBuilder.listNode(representation);

        //when
        boolean cyclic = isListCyclic.isCyclic(head);

        //then
        assertFalse(cyclic);
    }

    @Test
    public void givenOneElementListReturnFalse() {
        //given
        String representation = "1";
        ListNode head = listNodeBuilder.listNode(representation);

        //when
        boolean cyclic = isListCyclic.isCyclic(head);

        //then
        assertFalse(cyclic);
    }

    @Test
    public void givenOrdinarySortedListReturnFalse() {
        //given
        String representation = "1,2,3,4,5,6";
        ListNode head = listNodeBuilder.listNode(representation);

        //when
        boolean cyclic = isListCyclic.isCyclic(head);

        //then
        assertFalse(cyclic);
    }

    @Test
    public void givenListWithRepeatedElementAtTheEndReturnTrue() {
        //given
        String representation = "1,2,3,4,5,6,6";
        ListNode head = listNodeBuilder.listNode(representation);

        //when
        boolean cyclic = isListCyclic.isCyclic(head);

        //then
        assertTrue(cyclic);
    }

    @Test
    public void givenNullListReturnFalse() {
        //given
        String representation = null;
        ListNode head = listNodeBuilder.listNode(representation);

        //when
        boolean cyclic = isListCyclic.isCyclic(head);

        //then
        assertFalse(cyclic);
    }

    @Test
    public void givenFullyCyclicListReturnTrue() {
        //given
        String representation = "1,2,3,4,5,6,1";
        ListNode head = listNodeBuilder.listNode(representation);

        //when
        boolean cyclic = isListCyclic.isCyclic(head);

        //then
        assertTrue(cyclic);
    }

}
