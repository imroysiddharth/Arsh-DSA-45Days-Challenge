public class Sort_Colors {
    
        public static void sortColors(int[] nums) {
            int high = nums.length-1 ;
            int low =0 ;
            int mid = 0 ;
            
            while(mid<=high){
              if(nums[mid]==0){
                int t= nums[low];
                nums[low]=nums[mid];
                nums[mid]=t ;
                low++;
                mid++;
              }else if(nums[mid]==2){
                 int t= nums[high];
                nums[high]=nums[mid];
                nums[mid]=t ;
                high--;
              }else{
                mid++;
              }
                
            }
        }
        public static void main(String[] args) {
            int arr[]={1,2,1,0,0,0,2,1,1};
            sortColors(arr);
            for(int i = 0 ; i<arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
        }
    
}
