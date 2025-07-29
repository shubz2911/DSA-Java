package LeetCode;

public class StockBuyAndSell {
    public static void main(String [] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(bestBS(prices));

    }

    public static int bestBS(int [] prices){
        int maxProfit = 0;
        int bestBuy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return maxProfit;
    }
}
