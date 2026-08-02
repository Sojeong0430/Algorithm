import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int max = 0;
        
        for(int[] size: sizes){
            max = Math.max(max, size[0]);
            max = Math.max(max, size[1]);
        }
        
        int preMax = 0;
        
        for(int[] size : sizes){
            int second = Math.min(size[0], size[1]);
            
            if(second > preMax){
                preMax = second;
            }
        }
        
        return max * preMax;
    }
}