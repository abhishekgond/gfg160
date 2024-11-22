class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int result =0;
        int buy = prices[0];
        int sell =prices[0];
        if(prices.length==1) return 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                sell = prices[i];
            }
            else{
                buy=prices[i];
                sell=prices[i];
            }
            result= Math.max(result,sell-buy);
        }
        return result;
    }
}