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
        int wordLength = begin.length();
        if (wordLength == 0 || dict.isEmpty()) return 0;
        if (wordLength == 1) return 2;

        Queue<PathNode> path = new ArrayDeque<>(256);
        path.add(new PathNode(begin, 1));

        PathNode node;
        while (!path.isEmpty()) {
            node = path.remove();
            if (end.equals(node.word)) return node.path;
            for (int i = 0; i < wordLength; i++) {
                char[] letters = node.word.toCharArray();
                for (char c = 'a' ; c <= 'z' ; c++) {
                    letters[i] = c;
                    String newWord = new String(letters);
                    if (dict.contains(newWord)) {
                        path.add(new PathNode(newWord, node.path + 1));
                        dict.remove(newWord);
                    }
                }
            }
        }
        return -1;
    }

}
