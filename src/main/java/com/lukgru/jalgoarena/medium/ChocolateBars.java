package com.lukgru.jalgoarena.medium;

/**
 * A rectangular chocolate bar is divided into squares by horizontal and vertical grooves, in the usual way.
 * It is to be cut into individual squares. A cut is made by choosing a piece and cutting along
 * one of it grooves. (Thus each cut splits one piece into two pieces).
 * Additionally, your chocolate is already cut into two pieces.
 * Write a method countChocolateCuts with a number answering question - what is the minimal number of cuts
 * needed to completely cut the two parts of chocolate into all its squares?
 Examples
 [[1]
 [1, 1, 1]
 [1]]
 &           ==> 8
 [[1, 1, 1]
 [1]
 [1, 1, 1]]
 */
public class ChocolateBars {

    public int countChocolateCuts(int[][] chocolateBarPartOne, int[][] chocolateBarPartTwo) {
        return countCuts(chocolateBarPartOne) + countCuts(chocolateBarPartTwo);
    }

    private int countCuts(int[][] bar) {
        if (bar == null) return 0;

        int width = bar[0].length;
        for (int i = 1; i < bar.length; i++) {
            width = Math.max(width, bar[i].length);
        }
        return bar.length + width - 2;
    }

}
