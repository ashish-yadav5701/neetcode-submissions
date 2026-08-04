class Solution {
    public int maxProfit(int[] prices) {
        // int profit=0;
        // for(int i=0; i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int cost= prices[j]-prices[i];
        //         profit=Math.max(profit,cost);
        //     }
        // }
        // return profit;
        int profit=0;
        int i=0;
        int j=1;
        while(i<prices.length && j<prices.length){
            if(prices[i]>prices[j]){
                i=j;
                j++;
                continue;
            }
            else{
             profit=Math.max(prices[j]-prices[i],profit);
             j++;
            }
        }
        return profit;
    }
}
