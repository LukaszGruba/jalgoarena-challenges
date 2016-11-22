package com.lukgru.jalgoarena;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukasz on 09.11.2016.
 */
public class ListPathNodeBuilderTest {

    private ListNodeBuilder listNodeBuilder = new ListNodeBuilder();

    @Test
    public void givenNullRepresentationShouldBuildNullList() {
        //given
        String representation = null;

        //when
        ListNode list = listNodeBuilder.listNode(representation);

        //then
        assertNull(list);
    }

    @Test
    public void givenEmptyRepresentationShouldReturnNullList() {
        //given
        String representation = "";

        //when
        ListNode list = listNodeBuilder.listNode(representation);

        //then
        assertNull(list);
    }

    @Test
    public void shouldReturnOneNodeList() {
        //given
        String representation = "1";

        //when
        ListNode list = listNodeBuilder.listNode(representation);

        //then
        assertEquals(1, list.value);
        assertEquals(null, list.next);
    }

    @Test
    public void shouldReturnCorrectList() {
        //given
        String representation = "1,2,3,4,5,6,7,8,9";

        //when
        ListNode list = listNodeBuilder.listNode(representation);

        //then
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9)))))))));
        assertEquals(expected, list);

    }
}