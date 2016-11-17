package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by grubal on 2016-11-17.
 */
public class MakeChangeTest {

    private MakeChange makeChange = new MakeChange();

    @Test
    public void givenNullCoinsArrayReturnZero() {
        //given
        int[] coins = {};
        int amount = 10;

        //when
        int possibilities = makeChange.makeChange(coins, amount);

        //then
        int expected = 0;
        assertEquals(expected, possibilities);
    }

    @Test
    public void givenZeroAmountReturnZero() {
        //given
        int[] coins = {10,5,1};
        int amount = 0;

        //when
        int possibilities = makeChange.makeChange(coins, amount);

        //then
        int expected = 0;
        assertEquals(expected, possibilities);
    }

    @Test
    public void givenNegativeAmountReturnZero() {
        //given
        int[] coins = {10,5,1};
        int amount = -10;

        //when
        int possibilities = makeChange.makeChange(coins, amount);

        //then
        int expected = 0;
        assertEquals(expected, possibilities);
    }

    @Test
    public void givenZeroCoinInCoinsIgnoreIt() {
        //given
        int[] coins = {1,0};
        int amount = 1;

        //when
        int possibilities = makeChange.makeChange(coins, amount);

        //then
        int expected = 1;
        assertEquals(expected, possibilities);
    }

    @Test
    public void givenAmountLessThanBiggerCoinReturnProperly() {
        //given
        int[] coins = {25,10,5,1};
        int amount = 10;

        //when
        int possibilities = makeChange.makeChange(coins, amount);

        //then
        int expected = 4;
        assertEquals(expected, possibilities);
    }

    @Test
    public void givenAmountGreaterThanBiggerCoinReturnProperly() {
        //given
        int[] coins = {25,10,5,1};
        int amount = 100;

        //when
        int possibilities = makeChange.makeChange(coins, amount);

        //then
        int expected = 220;
        assertEquals(expected, possibilities);
    }
}
