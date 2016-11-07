package com.lukgru.jalgoarena.medium;

import com.lukgru.jalgoarena.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Lukasz on 07.11.2016.
 */
public class IsListCyclicTest {

    private IsListCyclic isListCyclic = new IsListCyclic();

    @Test
    public void givenNullReturnFalse() {
        assertFalse(isListCyclic.isCyclic(null));
    }

    @Test
    public void givenOneElementNonCycleReturnFalse() {
        //given
        ListNode node = new ListNode(0);

        //when
        boolean cyclic = isListCyclic.isCyclic(node);

        //then
        assertFalse(cyclic);
    }

    @Test
    public void givenOneElementCycleReturnTrue() {
        //given
        ListNode node = new ListNode(0);
        node.next = node;

        //when
        boolean cyclic = isListCyclic.isCyclic(node);

        //then
        assertTrue(cyclic);
    }

    @Test
    public void givenMultiElementNonCycleReturnFalse() {
        //TODO: add more tests
    }

}