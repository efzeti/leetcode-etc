package org.example.leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 **/

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(arr));
    }


    public static int maxProfit(int[] prices) {
        int cheapest = prices[0];
        int highestProfit = 0;


        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < cheapest) {
                cheapest = prices[i];
            }
            highestProfit = Math.max(prices[i] - cheapest, highestProfit);
        }

        return highestProfit;
    }
}
