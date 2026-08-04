class Solution {
    public int maxProfit(int[] prices) {

        int profit=0;
        int i=0;
        int j=1;
        while(j<prices.length){
            if(prices[i]<prices[j]){
                profit= Math.max(prices[j]-prices[i],profit);
            }
            else{
                i=j;
            }
            j+=1;
        }
        return profit;
    }
}
