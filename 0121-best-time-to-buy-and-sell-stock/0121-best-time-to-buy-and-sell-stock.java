class Solution {
    public int maxProfit(int[] p) {
        int  buy=p[0],profit=0;
        for(int x:p){
            buy=Math.min(buy,x);
            profit=Math.max(profit,x-buy);
        }
        return profit;
    }
}