class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int profit = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                profit = Math.max(profit, prices[r] - prices[l]);
            }
            else {
                l = r;
            }
            r++;
        }
        return profit;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(sol.maxProfit(prices));
    }
}