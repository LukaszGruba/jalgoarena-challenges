package com.lukgru.jalgoarena.hard;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Given two words (start and end), and a dictionary, write a method ladderLength to find the length of shortest transformation sequence from start to end, such that:
 Only one letter can be changed at a time
 Each intermediate word must exist in the dictionary
 Including first word as one transformation
 Examples
 "a", "c", ["a","b","c"] -> 2
 "game", "thee", ["frye","heat","tree","thee","game","free","hell","fame","faye"] -> 7
 */
public class WordLadder {

    private static class PathNode {
        private String word;
        private int path;

        public PathNode(String word, int path) {
            this.word = word;
            this.path = path;
        }
    }

    public int ladderLength(String begin, String end, HashSet dict) {
        LinkedList<PathNode> path = new LinkedList<>();
        path.add(new PathNode(begin, 1));

        while (!path.isEmpty()) {
            PathNode node = path.remove();
            if (end.equals(node.word)) return node.path;
            char[] letters = node.word.toCharArray();
            for (int i = 0; i < ; i++) {
                for (char c = 'a' ; c <= 'z' ; c++) {

                }
            }
        }
        return -1;
    }

}
