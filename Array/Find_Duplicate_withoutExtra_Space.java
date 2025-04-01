import java.util.ArrayList;
import java.util.List;

public class Find_Duplicate_withoutExtra_Space {
      public static List<Integer> findDuplicates(int[] nums) {
        // int arr[] = new int[nums.length+1];
         ArrayList<Integer> al = new ArrayList<>();
        // for(int i = 0 ; i<nums.length ; i++){
        //     arr[nums[i]]++;
        // }
        // for(int i=0; i<arr.length ; i++){
        //     if(arr[i]>1){
        //         al.add(i);
        //     }
        // }
        // return al ;
        for(int i=0 ; i<nums.length ; i++ ){
            int idx = Math.abs(nums[i])-1;

            if(nums[idx]<0){
                    al.add(idx+1);
            }else{
                nums[idx] = nums[idx]*-1;
            }
        }
        return al ;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        List<Integer> al = new ArrayList<>();
        al = findDuplicates(arr);
        System.out.println(al);
    }
}
