package org.example.leetcode;


/**
https://leetcode.com/problems/guess-number-higher-or-lower/description/
**/

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int low = 1;
        int mid;
        int hi = n;

        while (low <= hi) {
            mid = low + (hi - low) / 2;
            int guess; // = guess(mid);
            if (guess == -1) {
                hi = mid - 1;
            } else if (guess == 1) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
