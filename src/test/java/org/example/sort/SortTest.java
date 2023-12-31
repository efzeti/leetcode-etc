package org.example.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.example.sort.BubbleSort.bubbleSort;
import static org.example.sort.InsertionSort.insertionSort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class SortTest {

    @Test
    void allSortTest() {

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int count = r.nextInt(32);
            int[] arr = new int[count];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = r.nextInt(256) - 128;
            }
            int[] arrForInsertionSort = Arrays.copyOf(arr, arr.length);
            int[] arrForBubbleSort = Arrays.copyOf(arr, arr.length);
            insertionSort(arrForInsertionSort);
            bubbleSort(arrForBubbleSort);
            System.out.println(Arrays.toString(arrForInsertionSort));
            System.out.println(Arrays.toString(arrForBubbleSort));
            isInAscOrder(arrForInsertionSort);
            isInAscOrder(arrForBubbleSort);
        }
    }

    void isInAscOrder(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                fail();
            }
        }
    }
}