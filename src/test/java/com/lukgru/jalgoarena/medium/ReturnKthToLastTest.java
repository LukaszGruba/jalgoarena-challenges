package com.lukgru.jalgoarena.medium;

import com.lukgru.jalgoarena.ListNode;
import com.lukgru.jalgoarena.ListNodeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-14.
 */
public class ReturnKthToLastTest {

    private ReturnKthToLast returnKthToLast = new ReturnKthToLast();

    private ListNodeBuilder listNodeBuilder = new ListNodeBuilder();

    @Test
    public void returnFirstToLast() {
        //given
        String listRepresentation = "12,1,2,2,3,3,4,4,3,1";
        int k = 1;
        ListNode list = listNodeBuilder.listNode(listRepresentation);

        //when
        int element = returnKthToLast.kthToLast(list, k);

        //then
        int expected = 3;
        assertEquals(expected, element);
    }

    @Test
    public void returnEighthtoLast() {
        //given
        String listRepresentation = "10,1,2,2,3,3,4,4,3,6";
        int k = 8;
        ListNode list = listNodeBuilder.listNode(listRepresentation);

        //when
        int element = returnKthToLast.kthToLast(list, k);

        //then
        int expected = 1;
        assertEquals(expected, element);
    }

    @Test
    public void givenTooBigIndexReturnZero() {
        //given
        String listRepresentation = "13,1,1,1,2,3,4,3,3";
        int k = 100;
        ListNode list = listNodeBuilder.listNode(listRepresentation);

        //when
        int element = returnKthToLast.kthToLast(list, k);

        //then
        int expected = 0;
        assertEquals(expected, element);
    }

    @Test
    public void returnFirstElement() {
        //given
        String listRepresentation = "101,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1,10,1,2,2,3,3,4,4,3,6,1";
        int k = 219;
        ListNode list = listNodeBuilder.listNode(listRepresentation);

        //when
        int element = returnKthToLast.kthToLast(list, k);

        //then
        int expected = 101;
        assertEquals(expected, element);
    }

    @Test
    public void givenNegativeIndexReturnZero() {
        //given
        String listRepresentation = "11,1,2,2,3,3,4,4,3,6";
        int k = -1;
        ListNode list = listNodeBuilder.listNode(listRepresentation);

        //when
        int element = returnKthToLast.kthToLast(list, k);

        //then
        int expected = 0;
        assertEquals(expected, element);
    }

    @Test
    public void returnThirdToLast() {
        //given
        String listRepresentation = "1,2,3,4,5,6";
        int k = 3;
        ListNode list = listNodeBuilder.listNode(listRepresentation);

        //when
        int element = returnKthToLast.kthToLast(list, k);

        //then
        int expected = 3;
        assertEquals(expected, element);
    }

    @Test
    public void performance() {
        for (int i = 0; i < 100000; i++) {
            returnFirstToLast();
            returnEighthtoLast();
            givenTooBigIndexReturnZero();
            returnFirstElement();
            givenNegativeIndexReturnZero();
            returnThirdToLast();
        }
    }

}