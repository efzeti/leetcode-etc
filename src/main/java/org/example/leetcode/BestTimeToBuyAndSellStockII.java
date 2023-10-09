package org.example.leetcode;

/**
 https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
 **/

public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
//        int[] arr = {7,1,5,3,6,4};
        int[] arr = {1,2,3,4,5};

        System.out.println(maxProfit(arr));
    }


    public static int maxProfit(int[] prices) {

        if (prices.length == 2) {
            return Math.max(prices[1] - prices[0], 0);
        }

        int l;
        int currStockPrice = -1;
        int balance = 0;

        for (int r = 1; r < prices.length; r++) {
            l = r - 1;
            if (prices[l] < prices[r] && currStockPrice == -1) {
                System.out.println("buying @ " + l);
                currStockPrice = prices[l];
            } else if ((prices[l] > prices[r] && currStockPrice != -1 )) {
                System.out.println("selling @ " + l + "(" + prices[l] + " - " + currStockPrice + ")");
                balance = balance + (prices[l] - currStockPrice);
                System.out.println("balance " + balance);
                currStockPrice = -1;
            }

            if (r == prices.length - 1 && currStockPrice != -1) {
                balance = balance + (prices[r] - currStockPrice);
                currStockPrice = -1;
            }
        }

        return balance;
    }
}
