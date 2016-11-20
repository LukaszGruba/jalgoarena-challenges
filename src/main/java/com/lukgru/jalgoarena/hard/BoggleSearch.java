package com.lukgru.jalgoarena.hard;

/**
 * You're given a 2D Boggle Board which contains an m x n matrix of chars - char[][] board, and a String - word. Write a method - boggleSearch that searches the Boggle Board for the presence of the input word. Words on the board can be constructed with sequentially adjacent letters, where adjacent letters are horizontal or vertical neighbors (not diagonal). Also, each letter on the Boggle Board must be used only once.
 Examples

 Input Board :
 [
 [A, O, L],
 [D, E, L],
 [G, H, I]
 ]
 Word: "HELLO"
 Output: true
 */
public class BoggleSearch {

    public boolean boggleSearch(char[][] board, String word) {
        char[] letters = word.toCharArray();
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (board[y][x] == letters[0] && traverse(x, y, board.clone(), letters, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean traverse(int x, int y, char[][] board, char[] letters, int letterIndex) {
        if (letters[letterIndex] == board[y][x]) {
            board[y][x] = 0;
            letterIndex++;
            if (letterIndex == letters.length) return true;
            return (x != 0 ? traverse(x - 1, y, board, letters, letterIndex) : false)
                    || (y != 0 ? traverse(x, y - 1, board, letters, letterIndex) : false)
                    || (x != board[0].length - 1 ? traverse(x + 1, y, board, letters, letterIndex) : false)
                    || (y != board.length - 1 ? traverse(x, y + 1, board, letters, letterIndex) : false);
        }
        return false;
    }

}
