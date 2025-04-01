import java.util.HashMap;

public class SubArraysumEquals_K {
     public static int subarraySum(int[] nums, int k) {
        int c = 0 ; 
        int sum = 0 ;
        HashMap<Integer,Integer> hm  = new HashMap<>(); 
        hm.put(0,1);
        for(int i = 0 ; i<nums.length ; i++){
            sum+=nums[i];
            int req = k - sum ;
            if(req<0){
                req= req+k;
            }
            System.out.println(req);
            if(hm.containsKey(nums[i])){
                System.out.println("IF");
                hm.put(nums[i],hm.get(nums[i])+1);
                c+=hm.get(nums[i]);
                System.out.println(hm);
            }
            else{
                System.out.println("ELSE");
                hm.put(req , 1);
                System.out.println(hm);
            }
            System.out.println(c);
        }
        return c ;

    }
    public static void main(String[] args) {
        // int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr[] = {1,2,1,2,1};
        // int arr[] = {1,1,1};
        int k = 3 ;
        int c = subarraySum(arr,k);
        System.out.println("=====================");
        System.out.println(c);
    }
}
