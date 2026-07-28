class Solution {
    public int maxProfit(int[] prices) {
          int max_profit=0;
        int buystock=prices[0];
        for (int price:prices) {
                //max_profit=Math.max(max_profit,price-buystock);
               buystock=Math.min(price,buystock);
                max_profit=Math.max(max_profit,price-buystock);
        }
        
        return max_profit;
    }
}