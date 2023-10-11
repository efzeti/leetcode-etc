package org.example.sort;

public class GnomeSort {

    public static void gnomeSort(int[] arr) {
        int index = 1;
        int n = arr.length;
        while (index < n) {
            if (index > 0 && arr[index] < arr[index - 1]) {
                swap(arr,index, index - 1);
                index = index - 1;
            } else {
                index++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
