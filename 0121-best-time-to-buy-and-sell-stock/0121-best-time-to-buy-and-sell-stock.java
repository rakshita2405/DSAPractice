class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0)return 0;
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }
            maxprofit=Math.max(maxprofit,price-minprice);
        }
        return maxprofit;
    }
}