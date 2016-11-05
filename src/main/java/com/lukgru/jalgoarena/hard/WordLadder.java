package com.lukgru.jalgoarena.hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    public int ladderLength(String begin, String end, HashSet dict) {
        HashSet<String> dict2 = new HashSet<String>(dict);
        dict2.remove(begin);
        int minPath = Integer.MAX_VALUE;
        for (String word : getWordsWithOneLetterDifferent(begin, dict2)) {
            HashSet<String> h = new HashSet<String>(dict2);
            h.remove(word);
            minPath = Math.min(minPath, ladderLength(word, end, h));
        }
        return minPath + 1;
    }

    private List<String> getWordsWithOneLetterDifferent(String word, HashSet<String> dict2) {
        List<String> words = new ArrayList<String>();
        for (String s : dict2) {
            if (differsByOneLetter(word, s)) {
                words.add(s);
            }
        }
        return words;
    }

    private boolean differsByOneLetter(String word1, String word2) {
        int differentLetters = 0;
        for (int i=0 ; i<word1.length() ; i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                differentLetters++;
                if (differentLetters > 1) return false;
            }
        }
        return differentLetters == 1;
    }

}
