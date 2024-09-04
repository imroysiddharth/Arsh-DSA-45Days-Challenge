public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int profit = 0 ;
        int buy = prices[0];
        for(int i = 0 ; i<prices.length ;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            else if(prices[i]-buy > profit){
                profit = prices[i]-buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        
        int arr[]= {7,1,5,3,6,4};
        int arr2[]= {7,5,4,3,1};
        int a = maxProfit(arr);
        int b = maxProfit(arr2);
        System.out.println(a+" "+b);
    }
}
