class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for(int price : prices){
            if(price<buy)
                buy = price;
            else
                profit = Math.max(profit, price-buy);
        }
        return profit;
    }
}
