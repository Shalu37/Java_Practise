public class BestTimeToBuySellStock{

    // time complexity will be here o(n^2) because two loops is runing upto n Times
    public static int maxProfitSell(int[] prices){
        int maxProfit = 0 ;
        for(int i=0; i <prices.length; i++){
            for(int j = i+1; j < prices.length; j ++){
                int profit = prices[i] - prices[j];
                if (profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;

    }


    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println("Max Profit: "  + maxProfitSell(prices));
    }
    
}
