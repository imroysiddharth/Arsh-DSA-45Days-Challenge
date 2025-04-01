import java.util.HashMap;

public class TwoSum {
     public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0; i<nums.length ; i++){
            int need = target - nums[i];
            if(hm.containsKey(nums[i])){
                ans[0]=hm.get(nums[i]);
                ans[1]=i;
            }else{
                hm.put(need,i);
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        
    }
}
