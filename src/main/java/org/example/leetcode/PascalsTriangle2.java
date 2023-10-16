package org.example.leetcode;


import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii
 **/

public class PascalsTriangle2 {

    public static void main(String[] args) {
        getRow(3);
    }


    public static List<Integer> getRow(int rowIndex) {

        Integer[] arr = new Integer[rowIndex + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;

        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                arr[j] = arr[j] + arr[j - 1];
            }
        }

        return Arrays.asList(arr);
    }
}
