package com.lukgru.jalgoarena.hard;

import java.util.*;

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

    private Map<String, Integer> minPaths = new HashMap<>();

    //TODO: improve performance significantly
    public int ladderLength(String begin, String end, HashSet dict) {
        minPaths = new HashMap<>();
        return find(begin, end, dict);
    }

    public int find(String begin, String end, HashSet dict) {
        if (begin == null || end == null || dict.size() == 0) return 0;
        if (differsByOneLetter(begin, end)) return 2;
        if (minPaths.containsKey(begin)) return minPaths.get(begin) != Integer.MAX_VALUE ? minPaths.get(begin) + 1 : minPaths.get(begin);
        HashSet<String> dict2 = new HashSet<String>(dict);
        dict2.remove(begin);
        int minPath = Integer.MAX_VALUE;
        List<String> wordsWithOneLetterDifferent = getWordsWithOneLetterDifferent(begin, dict2);
        for (String word : wordsWithOneLetterDifferent) {
            HashSet<String> h = new HashSet<String>(dict2);
            h.remove(word);
            minPath = Math.min(minPath, find(word, end, h));
            minPaths.put(word, minPath);
//            System.out.println(minPath);
        }
        return minPath != Integer.MAX_VALUE ? minPath + 1 : minPath;
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
