

// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int total =0;
        int n = prices.length;
        int buy  =prices[0];
        int sell =prices[0];
        if(n==1) return buy-sell;
        for(int i=1;i<n;i++){
            if(prices[i]>=prices[i-1]){
                sell = prices[i];
            }
            else{
                total += sell-buy;
                buy = prices[i];
                sell=prices[i];
            }
        }
        total += sell-buy;
        return total;
    }
}