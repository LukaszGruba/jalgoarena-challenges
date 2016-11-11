package com.lukgru.jalgoarena.medium;

/**
 * Given an m x n 2D image matrix where each integer represents a pixel, write a method flipVerticalAxis to flip it in-place along its vertical axis.
 Examples
 [[1, 0],
 [1, 0]]
 ->
 [[0, 1],
 [0, 1]]

 1,0,1,
 1,1,0,
 0,1,1,
 */
public class VerticalFlip {

    public void flipVerticalAxis(int[][] matrix) {
        if (matrix == null || matrix[0].length <= 1) return;

        int m = matrix.length;
        int n = matrix[0].length;
        for (int i=0 ; i<m ; i++) {
            int n2 = n/2;
            for (int j=0 ; j<n2 ; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = tmp;
            }
        }
    }

}
