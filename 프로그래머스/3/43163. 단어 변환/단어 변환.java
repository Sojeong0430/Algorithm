import java.util.*;

class Solution {
    
    String[] words;
    String target;
    boolean[] visited;
    int minCount;
    boolean changed = false;
    
    public int solution(String begin, String target, String[] words) {
        this.words = words;
        this.target = target;
        visited = new boolean[words.length];
        minCount = words.length;
        
        dfs(begin, 0);
        
        if(changed){
            return minCount;
        }else{
            return 0;
        }
    }
    
    void dfs(String current, int count){
        if(current.equals(target)){
            if(count < minCount){
                minCount = count;
                changed = true;
            }
            return;
        }else{
            if(count >= words.length){
                return;
            }
        }
        
        for(int i = 0 ; i < words.length ; i++){
            if(!visited[i]){
                if(compare(current, words[i])){
                    visited[i] = true;
                    dfs(words[i], count+1);
                    visited[i] = false;
                }
            }
        }
    }
    
    boolean compare(String current, String next){
        int difCount = 0;
        for(int i = 0 ; i < current.length() ; i++){
            if(current.charAt(i) != next.charAt(i)){
                difCount += 1;
                if(difCount > 1){
                    return false;
                }
            }
        }
        return true;
    }
}