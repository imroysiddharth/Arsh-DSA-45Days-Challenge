public class Remove_Duplicate_SortedArr {
    public static int removeDuplicates(int[] nums) {
  
        // int i = 0 ; 
        // int j = i+1 ;
        // int k = 0 ; 
        // while(j<nums.length-1){
        //     while(nums[i]==nums[j])j++ ;
        //     if(nums[i]!=nums[j]){

        //         nums[k+1]=nums[j];
        //         k++;
        //         // System.out.println(nums[k]);
                
        //         i= j ;
        //     }
        // }
        // return k+1;
         
     int i = 0 ; 
     int j = i+1 ;
     int k = 1 ; 
     while(j<nums.length){
         if(nums[i]==nums[j])j++ ;
         else{
         nums[k]=nums[j];
         k++;
         i= j ;
         }
       
     }
     return k;
        }

        public static void main(String[] args) {
            int arr[]={1,1,2};
            int a = removeDuplicates(arr);
            System.out.println(a);
            System.out.print(arr[0]+" ");
            System.out.print(arr[1]+" ");
            System.out.print(arr[2]+" ");
           
        
        }
}
