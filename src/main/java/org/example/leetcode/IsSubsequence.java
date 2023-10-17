package org.example.leetcode;

/**
 * https://leetcode.com/problems/is-subsequence
 **/

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }

        int latestIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (latestIndex > t.length()) {
                return false;
            }

            int c = s.charAt(i);
            boolean found = false;

            while (latestIndex < t.length() && !found) {
                if (t.charAt(latestIndex) == c) {
                    found = true;
                }
                latestIndex++;
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}
