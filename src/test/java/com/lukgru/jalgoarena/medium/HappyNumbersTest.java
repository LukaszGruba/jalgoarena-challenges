package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-12.
 */
public class HappyNumbersTest {

    private HappyNumbers happyNumbers = new HappyNumbers();

    @Test
    public void test0() {
        //given
        int number = 0;

        //when
        boolean isHappy = happyNumbers.isHappyNumber(number);

        //then
        assertFalse(isHappy);
    }

    @Test
    public void test19() {
        //given
        int number = 19;

        //when
        boolean isHappy = happyNumbers.isHappyNumber(number);

        //then
        assertTrue(isHappy);
    }

    @Test
    public void test100() {
        //given
        int number = 100;

        //when
        boolean isHappy = happyNumbers.isHappyNumber(number);

        //then
        assertTrue(isHappy);
    }

    @Test
    public void test12() {
        //given
        int number = 12;

        //when
        boolean isHappy = happyNumbers.isHappyNumber(number);

        //then
        assertFalse(isHappy);
    }

    @Test
    public void test28() {
        //given
        int number = 28;

        //when
        boolean isHappy = happyNumbers.isHappyNumber(number);

        //then
        assertTrue(isHappy);
    }

    @Test
    public void test68() {
        //given
        int number = 68;

        //when
        boolean isHappy = happyNumbers.isHappyNumber(number);

        //then
        assertTrue(isHappy);
    }

    @Test
    public void test12352() {
        //given
        int number = 12352;

        //when
        boolean isHappy = happyNumbers.isHappyNumber(number);

        //then
        assertFalse(isHappy);
    }
}