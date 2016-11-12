package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-12.
 */
public class SnakeTest {

    private Snake snake = new Snake();

    @Test
    public void givenNullShouldReturnNull() {
        //given
        int[][] matrix = null;

        //when
        int[] spiral = snake.findSpiral(matrix);

        //then
        assertNull(spiral);
    }

    @Test
    public void givenOneElementArrayReturnItsOneElement() {
        //given
        int[][] matrix = {{0}};

        //when
        int[] spiral = snake.findSpiral(matrix);

        //then
        int[] expected = {0};
        assertArrayEquals(expected, spiral);
    }

    @Test
    public void given2x2MatrixShouldWorkProperly() {
        //given
        int[][] matrix = {
                {1,0},
                {1,0}
        };

        //when
        int[] spiral = snake.findSpiral(matrix);

        //then
        int[] expected = {1,0,0,1};
        assertArrayEquals(expected, spiral);
    }

    @Test
    public void given4x4MatrixShouldWorkProperly() {
        //given
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,0,1,2},
                {3,4,5,0}
        };

        //when
        int[] spiral = snake.findSpiral(matrix);

        //then
        int[] expected = {1,2,3,4,8,2,0,5,4,3,9,5,6,7,1,0};
        assertArrayEquals(expected, spiral);
    }

    @Test
    public void givenNonSquareMatrixShouldWorkProperly() {
        //given
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10,11,12},
                {13,14,15,16,17,18}
        };

        //when
        int[] spiral = snake.findSpiral(matrix);

        //then
        int[] expected = {1,2,3,4,5,6,12,18,17,16,15,14,13,7,8,9,10,11};
        assertArrayEquals(expected, spiral);
    }
}