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



    // Optimal: O(n) time, O(1) space
    public static int maxProfitOptimal(int[] prices) {
        int minPriceSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPriceSoFar) {
                minPriceSoFar = price;
            } else if (price - minPriceSoFar > maxProfit) {
                maxProfit = price - minPriceSoFar;
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println("Max Profit: "  + maxProfitOptimal(prices));
    }
    
}
