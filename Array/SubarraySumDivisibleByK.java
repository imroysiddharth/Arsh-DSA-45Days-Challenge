import java.util.HashMap;

public class SubarraySumDivisibleByK {
     public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm =  new HashMap<>();
        hm.put(0,1);
        int sum  =  0 ; 
        int result = 0 ;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem = sum % k ;
            if(rem<0){
                rem+=k;
            }
            if(hm.containsKey(rem)){
                result+= hm.get(rem);
            }
            hm.put(rem , hm.getOrDefault(rem,0)+1);
        }
        return result ;
    }
    public static void main(String[] args) {
        int arr[]={4,5,0,-2,-3,1};
        int k = 5 ;
        int ans = subarraysDivByK(arr,k);
        System.out.println(ans);
    }
}
