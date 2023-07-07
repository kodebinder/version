package com.company.stockprice;

public class BestTimeToSellStockDemo {
    public static void main(String[] args) {
        BestTimeToSellStockDemo bestTimeToSellStock = new BestTimeToSellStockDemo();
    //    int[] stockPrices = {7,1,5,3,6,4};
    //    int[] stockPrices = {7,6,5,4,3,1};
        int[] stockPrices = {7,6,4,3,1};
        int n = stockPrices.length;
        int start = 0;
        int end = n-1;
        int maxProfit = bestTimeToSellStock.getMaxProfit(stockPrices,n,start,end);
        System.out.println(maxProfit);
    }

    public int getMaxProfit(int[] stockPrices, int n, int start, int end){
        int profit = 0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(stockPrices[j]>stockPrices[i]){
                    int currentProfit = stockPrices[j] - stockPrices[i];
                    profit = Math.max(profit,currentProfit);
                }
            }
        }
        return profit;
    }
}
