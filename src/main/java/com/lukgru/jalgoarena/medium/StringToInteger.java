package com.lukgru.jalgoarena.medium;

/**
 * Implement method stoi to convert a string to an integer.
 Hint: Carefully consider all possible input cases. If you want a challenge.
 Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 Examples
 "1" -> 1

 1,010,+1,-1,-123,123,+-2,,

 */
public class StringToInteger {

    //TODO: change implementation
    public int stoi(String str) {
        try {
            return Integer.valueOf(str);
        } catch (Exception e) {
            return 0;
        }
    }
}
