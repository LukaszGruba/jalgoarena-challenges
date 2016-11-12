package com.lukgru.jalgoarena.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * Given a string, write a method isPermutationOfPalindrome to check if it is a permutation of a palindrome.
 The palindrome does not need to be limited to just dictionary words (skip non-letter characters). Your solution should be case insensitive.
 Examples
 "Tact Coa" -> true (permutations: "taco cat", "acto tca", etc.)
 */
public class PalindromePermutations {

    public boolean isPermutationOfPalindrome(String phrase) {
        if (phrase == null) return false;
        if (phrase.length() == 1) return true;

        phrase = phrase.replaceAll(" ", "").toLowerCase();
        int allowedUnique = phrase.length() % 2 == 0 ? 0 : 1;
        List<Character> chars = new LinkedList<>();
        char[] charArray = phrase.toCharArray();
        for (Character c : charArray) {
            if (chars.contains(c)) chars.remove(c);
            else chars.add(c);
        }
        return chars.size() <= allowedUnique;
    }

}
