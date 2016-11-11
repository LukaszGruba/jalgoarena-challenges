package com.lukgru.jalgoarena.medium;

/**
 * Given an m x n 2D image matrix where each integer represents a pixel, write a method flipHorizontalAxis to flip it in-place along its horizontal axis.
 Examples
 [[1, 0],
 [0, 1]]
 ->
 [[0, 1],
 [1, 0]]

 0,
 */
public class HorizontalFlip {

    public void flipHorizontalAxis(int[][] matrix) {
        if (matrix == null || matrix.length <= 1) return;

        int n = matrix.length / 2;
        for (int i = 0; i<n; i++) {
            int[] tmp = matrix[i];
            matrix[i] = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = tmp;
        }
    }

}
