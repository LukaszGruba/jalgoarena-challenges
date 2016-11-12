package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-11.
 */
public class RotateMatrixTest {

    private RotateMatrix rotateMatrix = new RotateMatrix();

    @Test
    public void givenNullReturnNull() {
        //given
        int[][] matrix = null;

        //when
        rotateMatrix.rotate(matrix);

        //then
        assertNull(matrix);
    }

    @Test
    public void givenOneElementMatrixDoNothing() {
        //given
        int[][] matrix = new int[][]{new int[]{0}};

        //when
        rotateMatrix.rotate(matrix);

        //then
        int[][] expected = {{0}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void given2x2MatrixShouldRotateProperly() {
        //given
        int[][] matrix = {
                {1, 2},
                {5, 6}
        };

        //when
        rotateMatrix.rotate(matrix);

        //then
        int[][] expected = {
                {5, 1},
                {6, 2}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void given4x4MatrixShouldRotateProperly() {
        //given
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,0,1,2},
                {3,4,5,6}
        };

        //when
        rotateMatrix.rotate(matrix);

        //then
        int[][] expected = {
                {3,9,5,1},
                {4,0,6,2},
                {5,1,7,3},
                {6,2,8,4}
        };
        assertArrayEquals(expected, matrix);
    }

}