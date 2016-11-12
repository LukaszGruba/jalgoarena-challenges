package com.lukgru.jalgoarena.medium;

/**
 * Write a method findSpiral to traverse a 2D matrix of ints in a clockwise spiral order and set the elements to an output array of integers.
 Example
 Input Matrix :
 {1, 2, 3}
 {4, 5, 6}
 {7, 8, 9}

 Output ArrayList:[1, 2, 3, 6, 9, 8, 7, 4, 5]
 */
public class Snake {

    public int[] findSpiral(int[][] matrix) {
        if (matrix == null) return null;

        int m = matrix.length ;
        int n = matrix[0].length;
        int numberOfElements = m * n;

        if (numberOfElements == 1) return new int[]{matrix[0][0]};

        int[] result = new int[numberOfElements];
        int resultIndex = 0;

        int posM = 0;
        int posN = -1;

        int rightB = n - 1;
        int leftB = 0;
        int bottomB = m - 1;
        int topB = 1;

        int dir = 0;

        while (resultIndex < numberOfElements) {
            if (dir == 0) {
                posN++;
                result[resultIndex] = matrix[posM][posN];
                resultIndex++;
                if (posN == rightB) {
                    dir = 1;
                    rightB--;
                }
            }
            else if (dir == 1) {
                posM++;
                result[resultIndex] = matrix[posM][posN];
                resultIndex++;
                if (posM == bottomB) {
                    dir = 2;
                    bottomB--;
                }
            }
            else if (dir == 2) {
                posN--;
                result[resultIndex] = matrix[posM][posN];
                resultIndex++;
                if (posN == leftB) {
                    dir = 3;
                    leftB++;
                }
            }
            else {
                posM--;
                result[resultIndex] = matrix[posM][posN];
                resultIndex++;
                if (posM == topB) {
                    dir = 0;
                    topB++;
                }
            }
        }
        return result;
    }

}
