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



 A,F,A,J,
 S,I,V,A,
 E,R,O,C,
 C,X,E,K,
 O,D,F,S,
 D,E,E,E,

 DFS
 A,F,A,J,
 S,I,V,A,
 E,R,O,C,
 C,X,E,K,
 O,D,F,S,
 D,E,E,E,

 ROCKS
 A,F,A,J,
 S,I,V,A,
 E,R,O,C,
 C,X,E,K,
 O,D,F,S,
 D,E,E,E,

 AXE
 A,F,A,J,
 S,I,V,A,
 E,R,O,C,
 C,X,E,K,
 O,D,F,S,
 D,E,E,E,

 JACK
 A,F,A,J,
 S,I,V,A,
 E,R,O,C,
 C,X,E,K,
 O,D,F,S,
 D,E,E,E,

 SEE
 A,O,L,
 D,E,L,
 G,H,I,

 HELLO
 A,F,A,J,
 S,I,V,A,
 E,R,O,C,
 C,X,E,K,
 O,D,F,S,
 D,E,E,E,

 ROCK
 A,F,A,J,
 S,I,V,A,
 E,R,O,C,
 C,X,E,K,
 O,D,F,S,
 D,E,E,E,

 FIRECODE
 A,F,A,J,
 S,I,V,A,
 E,R,O,C,
 C,X,E,K,
 O,D,F,S,
 D,E,E,E,

 FIRES
 A,F,A,J,
 S,I,V,A,
 E,R,O,C,
 C,X,E,K,
 O,D,F,S,
 D,E,E,E,

 JACKET

 */
public class BoggleSearch {

    public boolean boggleSearch(char[][] board, String word) {
        return false;
    }

}
