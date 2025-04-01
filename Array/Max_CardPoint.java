public class Max_CardPoint {
    
        public static int maxScore(int[] cardPoints, int k) {
         
            int n = cardPoints.length ;
           
            int sum  = Integer.MIN_VALUE;
            for(int i = 0 ; i<=k ; i++ ){
                int lsum = 0 ; 
                int rsum = 0 ; 
                for(int l = k-1-i ; l>=0 ; l--){
                    lsum+=cardPoints[l];
                }
                for(int m = n-i ; m<n ; m++){
                    rsum += cardPoints[m];
                }
                System.out.println(lsum+" "+rsum);
                int tSum = lsum+rsum;
                sum = Math.max(sum, tSum);
                // System.out.println(sum);
            }

            return sum ;
        }
        public static int maxScore2(int[] cardPoints, int k) {
            int n = cardPoints.length ;
            int totalSum = 0 ;
            for(int i:cardPoints){
                totalSum +=i ;
            }
            int sum = 0 ;
            for(int i = 0 ; i<n-k ; i++){
                sum += cardPoints[i];
            }
            int maxSum = totalSum - sum ;
            for(int i = n-k ; i<n ;i++){
                sum =sum + cardPoints[i];
                sum = sum - cardPoints[i - (n-k)];
                maxSum = Math.max(maxSum , totalSum-sum);
            }
            return maxSum ;
        }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,1};
        int k = 3 ;
        int ans = maxScore(arr, k);
        System.out.println(ans);

       


    }
}
