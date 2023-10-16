package org.example.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
https://leetcode.com/problems/ransom-note
**/
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<String> letters = new ArrayList<>(Arrays.asList(magazine.split("")));

        for (String l : ransomNote.split("")) {
            if (letters.contains(l)) {
                letters.remove(l);
            } else {
                return false;
            }
        }

        return true;
    }
}
