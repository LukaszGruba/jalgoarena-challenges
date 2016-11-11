package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-11.
 */
public class HorizontalFlipTest {

    private HorizontalFlip horizontalFlip = new HorizontalFlip();

    @Test
    public void givenNullInputShouldReturnNull() {
        //given
        int[][] matrix = null;

        //when
        horizontalFlip.flipHorizontalAxis(matrix);

        //then
        assertArrayEquals(null, matrix);
    }


    @Test
    public void givenOnlyOneRowShouldDoNothing() {
        //given
        int[][] matrix = new int[][]{new int[]{0, 1}};

        //when
        horizontalFlip.flipHorizontalAxis(matrix);

        //then
        int[][] expected = new int[][]{new int[]{0, 1}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void givenRegularMatrixShouldFlipItHorizontally() {
        //given
        int[][] matrix = new int[][]{
                new int[]{1, 0, 1},
                new int[]{1, 1, 0},
                new int[]{0, 1, 1}
        };

        //when
        horizontalFlip.flipHorizontalAxis(matrix);

        //then
        int[][] expected = new int[][]{
                new int[]{0, 1, 1},
                new int[]{1, 1, 0},
                new int[]{1, 0, 1}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void givenOneNumberArrayShouldDoNothing() {
        //given
        int[][] matrix = new int[][]{new int[]{0}};

        //when
        horizontalFlip.flipHorizontalAxis(matrix);

        //then
        int[][] expected = new int[][]{new int[]{0}};
        assertArrayEquals(expected, matrix);
    }

}