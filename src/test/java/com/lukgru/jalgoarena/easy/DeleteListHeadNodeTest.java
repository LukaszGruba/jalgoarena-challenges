package com.lukgru.jalgoarena.easy;

import com.lukgru.jalgoarena.ListNode;
import com.lukgru.jalgoarena.ListNodeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteListHeadNodeTest {

    private DeleteListHeadNode deleteListHeadNode = new DeleteListHeadNode();

    private ListNodeBuilder listNodeBuilder = new ListNodeBuilder();

    @Test
    public void test1() {
        //given
        ListNode list = listNodeBuilder.listNode("");

        //when
        ListNode newList = deleteListHeadNode.deleteAtHead(list);

        //then
        assertNull(newList);
    }

    @Test
    public void test2() {
        //given
        ListNode list = listNodeBuilder.listNode("1");

        //when
        ListNode newList = deleteListHeadNode.deleteAtHead(list);

        //then
        assertNull(newList);
    }

    @Test
    public void test3() {
        //given
        ListNode list = listNodeBuilder.listNode("5,3");

        //when
        ListNode newList = deleteListHeadNode.deleteAtHead(list);

        //then
        ListNode expeced = listNodeBuilder.listNode("3");
        assertEquals(expeced, newList);
    }

    @Test
    public void test4() {
        //given
        ListNode list = listNodeBuilder.listNode("1,2,3,4,5,6");

        //when
        ListNode newList = deleteListHeadNode.deleteAtHead(list);

        //then
        ListNode expeced = listNodeBuilder.listNode("2,3,4,5,6");
        assertEquals(expeced, newList);
    }

}