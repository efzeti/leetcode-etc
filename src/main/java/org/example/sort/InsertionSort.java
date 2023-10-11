package org.example.sort;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int curr = arr[i];
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = curr;
        }
    }
}
