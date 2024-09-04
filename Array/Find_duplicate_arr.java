import java.util.HashMap;

public class Find_duplicate_arr{
    
    public static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm  = new HashMap<>();
        int ans = 0 ;
        for(int i= 0 ; i<nums.length ; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        for(int i = 0 ; i<nums.length ; i++){
            int cnt= hm.get(nums[i]);
            if(cnt>1) ans = nums[i];
        }
        return ans; 
    }
    
    public static void main(String[] args) {
        	int nums[] = {2,2,2,3,4,5};
		int a= findDuplicate(nums);
		System.out.println(a);
    }

}