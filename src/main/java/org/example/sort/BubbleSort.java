package org.example.sort;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 1; i < n; i++) {
                int j = i - 1;
                if (arr[i] < arr[j]) {
                    unsorted = true;
                    int lower = arr[i];
                    arr[i] = arr[j];
                    arr[j] = lower;
                }
            }
        }
    }
}
