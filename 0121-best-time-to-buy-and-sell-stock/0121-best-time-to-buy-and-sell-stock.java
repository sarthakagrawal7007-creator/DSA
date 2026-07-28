class Solution {
    public int maxProfit(int[] prices) {
         int buyStock=prices[0];
        int max=0;
        int profit=0;
        for (int i=1;i<prices.length;i++) {
                if (buyStock<prices[i]){
                profit=prices[i]-buyStock;
                max=Math.max(max,profit);
            }else {
            buyStock=prices[i];
            }
               
        }
        
        return max;
    }
}