public class FirstOccOfString{
    public static  int findOcc(String str, String substr){

        for(int i = 0 ; i<str.length()-substr.length() ; i++){
            StringBuilder sb = new StringBuilder();
            for(int j= 0 ; j<substr.length() ; j++){
                sb.append(str.charAt(i+j));
                
            }
            String temp =    sb.toString() ;
            if(substr.equals(temp))return i ; 
        }
        return -1;
    }
    public static  int findOcc1(String str, String substr){
       if(str.length()==1 && substr.length()==1){
        if(str.equals(substr))return 0;
        return -1;
       }
        for(int i = 0 ; i<=str.length()-substr.length() ; i++){
                String temp = str.substring(i, i+substr.length());
                System.out.println(temp);
                if(temp.equals(substr))return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String  s1 ="abc";
        // String  s1 ="aasadbutsad";
        String s2 = "c";
        // String s2 = "sad";
        // System.out.println(findOcc(s1, s2));
        System.out.println("===========================");
        System.out.println(findOcc1(s1, s2));
    }
}