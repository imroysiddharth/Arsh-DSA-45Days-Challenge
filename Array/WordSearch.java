public class WordSearch {
    static int m ;
    static int n ;
    static int l ;
    public static boolean exist(char[][] board, String word) {
        m = board.length ;
        n = board[0].length ; 
        l = word.length() ;
        
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++ ){
                if(board[i][j]==word.charAt(0) && find(board , i , j , word ,0)){
                    return true ; 
                }
            }
        }
        return false ;
    }

    public static boolean find(char[][]board ,  int i , int j ,String word ,  int idx){
        if(idx>=l)return true ;

        if(i<0 || i>=m || j<0 || j>=n || board[i][j]!=word.charAt(idx))return false ;

        char ch = board[i][j];
        board[i][j]='$';

        if(find(board,i+1,j, word ,idx+1))return true ;
        if(find(board,i-1,j, word ,idx+1))return true ;
        if(find(board,i,j+1, word ,idx+1))return true ;
        if(find(board,i,j-1, word ,idx+1))return true ;

        board[i][j] = ch ; 
        return false ;
    } 

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word  = "ABCCED";
        System.out.println(exist(board,word));
    }
}
