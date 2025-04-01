public class Longest_common_prefix {
    private String compare(String a , String b){
        StringBuilder ret =new StringBuilder("");
        int i =0 , j= 0 ;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                    ret.append(a.charAt(i));
            }else{
                    return ret.toString() ;
            }
            i++;
            j++;
        }
         return ret.toString() ;
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        String Ans = strs[0];
           
        for(int i = 0 ; i<strs.length-1 ; i++){
            String x = compare(Ans,strs[i+1]);
            if(x.equals("")){
                return "";
            }
            Ans = x ;
        }
        return Ans ;
    }
}
