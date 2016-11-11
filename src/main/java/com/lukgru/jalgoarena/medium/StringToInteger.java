package com.lukgru.jalgoarena.medium;

/**
 * Implement method stoi to convert a string to an integer.
 Hint: Carefully consider all possible input cases. If you want a challenge.
 Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 Examples
 "1" -> 1

 */
public class StringToInteger {

    public int stoi(String str) {
        if (str == null) return 0;
        int result = 0;

        char[] chars = str.toCharArray();
        int i= 0;
        boolean negative = chars[0] == '-';
        if (negative || chars[0] == '+') {
            i++;
        }
        for (; i < chars.length; i++) {
            int v = (chars[i] - '0');
            if (v < 0 || v > 9) return 0;
            result = 10 * result + v;
        }

        return negative ? -result : result;
    }
}
