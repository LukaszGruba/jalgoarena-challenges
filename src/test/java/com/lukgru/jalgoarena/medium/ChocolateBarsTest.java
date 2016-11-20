package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-20.
 */
public class ChocolateBarsTest {

    private ChocolateBars chocolateBars = new ChocolateBars();

    @Test
    public void givenTwoNullBarsReturnZero() {
        //given
        int[][] bar1 = null;
        int[][] bar2 = null;

        //when
        int cuts = chocolateBars.countChocolateCuts(bar1, bar2);

        //then
        int expected = 0;
        assertEquals(expected, cuts);
    }

    @Test
    public void givenTwoSingleElementsReturnZero() {
        //given
        int[][] bar1 = {{1}};
        int[][] bar2 = {{1}};

        //when
        int cuts = chocolateBars.countChocolateCuts(bar1, bar2);

        //then
        int expected = 0;
        assertEquals(expected, cuts);
    }

    @Test
    public void shouldWorkForOnlyOneBar() {
        //given
        int[][] bar1 = null;
        int[][] bar2 = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };

        //when
        int cuts = chocolateBars.countChocolateCuts(bar1, bar2);

        //then
        int expected = 6;
        assertEquals(expected, cuts);
    }

    @Test
    public void given2Identical2x2Bars() {
        //given
        int[][] bar1 = {
                {0,0},
                {0,0}
        };
        int[][] bar2 = {
                {0,0},
                {0,0}
        };

        //when
        int cuts = chocolateBars.countChocolateCuts(bar1, bar2);

        //then
        int expected = 4;
        assertEquals(expected, cuts);
    }

    @Test
    public void given2Identical4x4Bars() {
        //given
        int[][] bar1 = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        int[][] bar2 = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };

        //when
        int cuts = chocolateBars.countChocolateCuts(bar1, bar2);

        //then
        int expected = 12;
        assertEquals(expected, cuts);
    }

    @Test
    public void givenComplexPieces() {
        //given
        int[][] bar1 = {
                {1},
                {1,1,1},
                {1}
        };
        int[][] bar2 = {
                {1,1,1},
                {1},
                {1,1,1}
        };

        //when
        int cuts = chocolateBars.countChocolateCuts(bar1, bar2);

        //then
        int expected = 8;
        assertEquals(expected, cuts);
    }

    @Test
    public void givenComplexPieces2() {
        //given
        int[][] bar1 = {
                {1,1,1,1},
                {1},
                {1,1,1},
                {1,1}
        };
        int[][] bar2 = {
                {1,1,1},
                {1},
                {1,1}
        };

        //when
        int cuts = chocolateBars.countChocolateCuts(bar1, bar2);

        //then
        int expected = 10;
        assertEquals(expected, cuts);
    }

}