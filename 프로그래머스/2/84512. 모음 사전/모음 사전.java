import java.util.*;

class Solution {
    
    static char[] chars = {'A','E','I','O','U'};
    static String answer;
    static int count;
    
    public int solution(String word) {
        answer = word;
        count = 0;
        dfs("");
        return count -1 ;
    }
    
    private boolean dfs(String current) {
        
        count++;
        
        if (current.equals(answer)) { 
            return true;
        }
        
        if (current.length() == 5) { 
            return false;
        }
        
        for (int i = 0; i < chars.length; i++) {
            if (dfs(current + chars[i])) {
                return true;
            }
        }
        
        return false;
    }
}