import java.util.HashMap;

public class Duplicate_char_in_string {
    public static void findDuplicate(String str){

        HashMap<Character,Integer> hm  = new HashMap<>();

        for(int i = 0 ; i<str.length() ; i++ ){
            char ch = str.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else{
                int cnt = hm.get(ch);
                hm.put(ch, cnt+1);
            }
        }
        for(Character k : hm.keySet()){
            if(hm.get(k)>=2){
                System.out.println("{"+k+","+hm.get(k)+"}");
            }
        }
    //   return hm ;
    }

    public static void main(String[] args) {
        String str ="geeksforgeeks";
        // HashMap<Character,Integer>hm = findDuplicate(str);
        findDuplicate(str);
        // for(Character k : hm.keySet()){
        //     if(hm.get(k)>=2){
        //         System.out.println("{"+k+","+hm.get(k)+"}");
        //     }
        // }
    }
}
