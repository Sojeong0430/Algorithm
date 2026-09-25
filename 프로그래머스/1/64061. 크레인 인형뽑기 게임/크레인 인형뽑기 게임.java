import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        
        Stack<Integer> s = new Stack<>();
        int count = 0;
        
        for(int i = 0 ; i < moves.length ; i++){
            int current = moves[i] - 1;
            
            for(int k = 0 ; k < board.length ; k++){
                if(board[k][current] != 0){
                    s.push(board[k][current]);
                    board[k][current] = 0;
                    break;
                }
            }
            
            if(s.size() >= 2){
                int temp = s.pop();
                if(s.peek() == temp){
                    s.pop();
                    count += 2;
                }else{
                    s.push(temp);
                }
            }
        }
        return count;
    }
}