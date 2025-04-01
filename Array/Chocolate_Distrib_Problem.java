import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_Distrib_Problem{
     public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long diff = Integer.MAX_VALUE;
        int i= 0 ;
        int j = m-1 ;
        while(j<a.size()){
            diff=Math.min(diff,a.get(j)-a.get(i));
            i++;
            j++;
        }
        return diff;
    }
    public static void main(String[] args) {
        
    }
}