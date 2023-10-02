package org.example.leetcode;


import java.util.Arrays;
import java.util.LinkedList;

/**
https://leetcode.com/problems/add-two-numbers/description/
**/

class AddTwoNumbers {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(2, 4, 3));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(5, 6, 4));

        System.out.println(addTwoNumbers(l1, l2));
    }


    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> out = new LinkedList<>();

        int maxSize = Math.max(l1.size(), l2.size());
        int plusInAdvance = 0;
        for (int i = 0; i < maxSize + 1; i++) {
            int n1 = l1.size() > i ? l1.get(i) : 0;
            int n2 = l2.size() > i ? l2.get(i) : 0;
            int sum = n1 + n2 + plusInAdvance;

            if (sum >= 10) {
                plusInAdvance = 1;
                sum = sum % 10;
            } else {
                plusInAdvance = 0;
            }
            if (l1.size() <= i && l2.size() <= i && plusInAdvance == 0) {
                return out;
            }
            out.add(sum);
        }

        return out;
    }
}
