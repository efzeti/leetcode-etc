package org.example.leetcode;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digs = new int[]{9,9,9,9};

        System.out.println(Arrays.toString(plusOne(digs)));
    }


    public static int[] plusOne(int[] digits) {

        int sum1 = digits[digits.length - 1] + 1;
        if (sum1 < 10) {
            digits[digits.length - 1] = sum1;
            return digits;
        } else {
            digits[digits.length - 1] = 0;
            for (int i = digits.length - 2; i >= 0; i--) {
                int sum2 = digits[i] + 1;
                if (sum2 < 10) {
                    digits[i] = sum2;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }
        }

        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;

    }
}
