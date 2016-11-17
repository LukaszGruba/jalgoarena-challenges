package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by grubal on 2016-11-16.
 */
public class StockMarketOracleTest {

    private StockMarketOracle stockMarketOracle = new StockMarketOracle();

    @Test
    public void test1() {
        //given
        int[] prices = {50,100};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 50;
        assertEquals(expected, profit);
    }

    @Test
    public void test2() {
        //given
        int[] prices = {};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 0;
        assertEquals(expected, profit);
    }

    @Test
    public void test3() {
        //given
        int[] prices = {1,2,3,4,3,2,4,5,1,2,3,4,5};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 10;
        assertEquals(expected, profit);
    }

    @Test
    public void test4() {
        //given
        int[] prices = {50,100,50,100,50};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 100;
        assertEquals(expected, profit);
    }

    @Test
    public void test5() {
        //given
        int[] prices = {100,40,20,10};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 0;
        assertEquals(expected, profit);
    }

    @Test
    public void test6() {
        //given
        int[] prices = {1,1};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 0;
        assertEquals(expected, profit);
    }

    @Test
    public void test7() {
        //given
        int[] prices = {1};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 0;
        assertEquals(expected, profit);
    }

    @Test
    public void test8() {
        //given
        int[] prices = {0,100,0,100,0,100};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 300;
        assertEquals(expected, profit);
    }

    @Test
    public void test9() {
        //given
        int[] prices = {150,100};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 0;
        assertEquals(expected, profit);
    }

    @Test
    public void test10() {
        //given
        int[] prices = {50,100,20,80,20};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 110;
        assertEquals(expected, profit);
    }

    @Test
    public void test11() {
        //given
        int[] prices = {123};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 0;
        assertEquals(expected, profit);
    }

    @Test
    public void test12() {
        //given
        int[] prices = {0,50,10,100,30};

        //when
        int profit = stockMarketOracle.maxProfit(prices);

        //then
        int expected = 140;
        assertEquals(expected, profit);
    }

//    @Test
    public void performance() {
        int[] prices = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 100000000; i++) {
            stockMarketOracle.maxProfit(prices);
        }
    }


}
