package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-11.
 */
public class VerticalFlipTest {

    private VerticalFlip verticalFlip = new VerticalFlip();

    @Test
    public void givenNullReturnNull() {
        //given
        int[][] matrix = null;

        //when
        verticalFlip.flipVerticalAxis(matrix);

        //then
        assertNull(matrix);
    }

    @Test
    public void givenOneElementMatrixDoNothing() {
        //given
        int[][] matrix = new int[][]{new int[]{0}};

        //when
        verticalFlip.flipVerticalAxis(matrix);

        //then
        int[][] expected = new int[][]{new int[]{0}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void givenSimpleSquareMatrixFlipProperly() {
        //given
        int[][] matrix = new int[][]{
                new int[]{1, 0},
                new int[]{1, 0}
        };

        //when
        verticalFlip.flipVerticalAxis(matrix);

        //then
        int[][] expected = new int[][]{
                new int[]{0, 1},
                new int[]{0, 1}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void givenSimpleSquareMatrix2FlipProperly() {
        //given
        int[][] matrix = new int[][]{
                new int[]{1, 0},
                new int[]{0, 1}
        };

        //when
        verticalFlip.flipVerticalAxis(matrix);

        //then
        int[][] expected = new int[][]{
                new int[]{0, 1},
                new int[]{1, 0}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void given3x3ShouldFlipProperly() {
        //given
        int[][] matrix = new int[][]{
                new int[]{1, 0, 1},
                new int[]{1, 1, 0},
                new int[]{0, 1, 1}
        };

        //when
        verticalFlip.flipVerticalAxis(matrix);

        //then
        int[][] expected = new int[][]{
                new int[]{1, 0, 1},
                new int[]{0, 1, 1},
                new int[]{1, 1, 0}
        };
        assertArrayEquals(expected, matrix);
    }

}