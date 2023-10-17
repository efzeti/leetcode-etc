package org.example.leetcode;

import java.util.*;

/**
 https://leetcode.com/problems/word-pattern
 **/

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog cat fish"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<String, String> charToWord = new HashMap<>();
        Map<String, String> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String c = String.valueOf(pattern.charAt(i));
            String word = words[i];

            if (!charToWord.containsKey(c)) {
                charToWord.put(c, word);
            }

            if (!wordToChar.containsKey(word)) {
                wordToChar.put(word, c);
            }

            if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
                return false;
            }
        }

        return true;
    }

}
