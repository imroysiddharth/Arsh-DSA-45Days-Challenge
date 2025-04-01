import java.util.Stack;

public class Valid_Parenthesis{
     public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++){

            if(s.charAt(i)=='('|| s.charAt(i)=='{'|| s.charAt(i)=='['){
                stk.push(s.charAt(i));
            }else{
                if(stk.isEmpty()){
                    return false;
                }
                char ch = stk.peek();
                if(s.charAt(i)==')'&& ch=='('  || s.charAt(i)=='}'&&ch=='{' || s.charAt(i)==']'&& ch=='['){
                    stk.pop();
                }else{
                    return false ;
                }
            }
        }
        return stk.isEmpty() ;
    }
    public static void main(String[] args) {
        
    }
}