package leetcode;

public class BuySellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<=prices.length - 1; i++ ) {
            if(prices[i] < min) {
                min = prices[i];
            }
            int profit = prices[i] - min;
            if(profit > 0 && profit > maxProfit)
                maxProfit = profit;
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
      return 0;
    }
}
