package com.lukgru.jalgoarena.medium;

/**
 * Implement a method compress to perform basic string compression using the counts of repeated characters.
 If the compressed string would not become smaller than original string, your method should return original string.
 Note: You can assume the string has only uppercase and lowercase letters (a-z).
 Examples
 "aabcccccaaa" -> "a2b1c5a3"
 */
public class StringCompression {

    public String compress(String str) {
        if (str == null || str.isEmpty()) return str;
        StringBuilder sb = new StringBuilder();
        char prev = '\0';
        int counter = 1;
        for (char c : str.toCharArray()) {
            if (c == prev) {
                counter++;
            }
            else {
                sb.append(prev).append(counter);
                prev = c;
                counter = 1;
            }
        }
        String compressed = sb.append(prev).append(counter).substring(2);
        return compressed.length() < str.length() ? compressed : str;
    }

}
