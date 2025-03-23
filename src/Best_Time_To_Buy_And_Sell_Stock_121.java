public class Best_Time_To_Buy_And_Sell_Stock_121 {
    public int maxProfit(int[] prices) {

        int min_price = 1000000;
        int profit = 0;

        for(int r: prices){
            if(r < min_price){
                min_price = r;
            }
            else if(r - min_price > profit){
                profit = r - min_price;
            }
        }

        return profit;
    }
}
