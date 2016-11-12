package com.lukgru.jalgoarena.medium;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method rotate to rotate the image by 90 degrees in place.
 Examples
 [[1, 2, 3, 4],
 [5, 6, 7, 8],
 [9, 0, 1, 2],
 [3, 4, 5, 6]]
 ->
 [[3, 9, 5, 1],
 [4, 0, 6, 2],
 [5, 1, 7, 3],
 [6, 2, 8, 4]]
 */
public class RotateMatrix {

    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 1) return;

        int n = matrix.length;
        int halfN = n/2;
        for (int i=0 ; i<halfN ; i++) {
            for (int j=0 ; j<halfN ; j++) {
                int tmp1 = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[i][j];
                int tmp2 = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = tmp1;
                tmp1 = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = tmp2;
                matrix[i][j]= tmp1;
            }
        }
    }
}
