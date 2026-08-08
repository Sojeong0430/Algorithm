import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1 ; i < food.length ; i++){
            food[i] /= 2;
            for(int k = 0 ; k < food[i] ; k++){
                sb.append(i);
            }
        }
        
        char[] chars = (sb.toString()).toCharArray();
        
        sb.append('0');
        
        for(int i = chars.length - 1 ; i >= 0 ; i--){
            sb.append(chars[i]);
        }
        
        return sb.toString();
    }
}