public class Move_Zeroes {

        public static void moveZeroesLeft(int[] nums) {
            int i = 0 ;
            int j = 0 ;
            while(i<nums.length && j<nums.length ){
                if(nums[i]==0){
                    i++ ;
                }
                if(nums[j]==0 && i<j){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp ; 
                }
                j++ ;
            }
        }

        public static void moveZeroesRight(int[] nums) {
            int i = 0;
            int j = 0;
            while(i<nums.length && j<nums.length ){
                if(nums[i]!=0){
                    i++ ;
                }
                if(nums[j]!=0 && i<j){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp ; 
                }
                j++ ;
            }
        }
   public static void main(String[] args) {
    int arr[]= {0,1,0,3,12};
    moveZeroesLeft(arr);
    // moveZeroesRight(arr);

    for(int i:arr){
        System.out.print(i+" ");
    }

   }
}
