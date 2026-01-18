class Solution {
    public int[] maxProfit(int[] prices) {
        int l = 0;
        int r = 0;
        int profit = 0;
        while (r < prices.length) {
            if (prices[r] > prices[l]) {
                profit += prices[r] - prices[l];
            }
            l++;
            r++;
        }
        return profit;
    }
}

class Main {
    public static void main(Str[] args) {
        Solution sol = new Solution();
        int[] prices = {7,1,2,3,4,5,6};
        System.out.println(sol.maxProfit(prices));
    }
}