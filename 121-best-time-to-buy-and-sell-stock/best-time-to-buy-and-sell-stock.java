class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-mini;
            if(maxp<profit)
            maxp=profit;
            if(prices[i]<mini)
            mini=prices[i];
        }return maxp;
    }
}