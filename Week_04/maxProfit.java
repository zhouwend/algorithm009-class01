class Solution {
    public int maxProfit(int[] prices) {
        //没有买入情况下，如果后一个数大于前一个数则买入，如果后一个数小于前一个数则卖出
        int maxProfit = 0;
        for(int i = 0; i < prices.length -1; i++) {

            if(prices[i + 1] > prices[i]) {
                maxProfit = maxProfit + prices[i+1] - prices[i];
            }
        }
        return maxProfit;


    }
}