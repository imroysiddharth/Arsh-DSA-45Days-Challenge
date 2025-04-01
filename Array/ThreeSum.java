import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] arr) {
        // int n = arr.length ;
        //  Set<List<Integer>> st = new HashSet<>();

        // for (int i = 0; i < n; i++) {
        //     Set<Integer> hashset = new HashSet<>();
        //     for (int j = i + 1; j < n; j++) {
        //         //Calculate the 3rd element:
        //         int third = -(arr[i] + arr[j]);

        //         //Find the element in the set:
        //         if (hashset.contains(third)) {
        //             List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
        //             temp.sort(null);
        //             st.add(temp);
        //         }
        //         hashset.add(arr[j]);
        //     }
        // }

        // // store the set elements in the answer:
        // List<List<Integer>> ans = new ArrayList<>(st);
        // return ans;

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0 ; i<arr.length ; i++ ){
            if(0<i && arr[i]==arr[i-1])continue ;
            int j = i+ 1 ;
            int k = arr.length -1 ;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum>0){
                    k-- ;
                }else if(sum<0){
                    j++;
                }else{
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[k]);
                    ans.add(al);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1])j++;
                    while(j<k && arr[k]==arr[k+1])k--;
                }
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
}
