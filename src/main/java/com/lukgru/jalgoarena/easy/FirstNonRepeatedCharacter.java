package com.lukgru.jalgoarena.easy;

/**
 * Write a method findFirstNonRepeatedChar that finds the first non-duplicate character in a string. Return null if no unique character is found.
 Example
 'asdsdakz -> 'k'
 */
public class FirstNonRepeatedCharacter {

    public String findFirstNonRepeatedChar(String str) {
        if (str == null || str.length() == 0) return null;
        for (int i = 0; i < str.length(); i++) {
            char nonRepeatedChar = str.charAt(i);
            boolean nonRepeated = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && nonRepeatedChar == str.charAt(j)) {
                    nonRepeated = false;
                    break;
                }
            }
            if (nonRepeated) return String.valueOf(nonRepeatedChar);
        }
        return null;
    }

}
