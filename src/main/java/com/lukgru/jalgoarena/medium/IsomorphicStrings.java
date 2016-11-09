package com.lukgru.jalgoarena.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings - input1 and input2, implement method isIsomorphic to determine if they are isomorphic. Two strings are isomorphic if the letters in one string can be remapped to get the second string. Remmapping a letter means replacing all occurrences of it with another letter. The ordering of the letters remains unchanged. You can also think of isomorphism as it is used in chemistry - i.e. having the same form or overall shape.
 Examples
 'css', 'dll' -> true
 'css', 'dle' -> false
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String input1, String input2) {
        if (input1 == null || input2 == null || input1.length() != input2.length()) return false;
        if (input1.equals(input2)) return true;

        return toNumeric(input1).equals(toNumeric(input2));
    }

    private String toNumeric(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int counter = 0;
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                sb.append(map.get(c));
            }
            else {
                counter++;
                sb.append(counter);
                map.put(c, counter);
            }
        }

        return sb.toString();
    }

}
