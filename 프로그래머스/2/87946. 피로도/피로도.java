import java.util.*;

class Solution {
    
    boolean[] visited;
    int[][] dungeons;
    List<Integer> count = new ArrayList<>();
    
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        
        dfs(k, 0);
        
        return Collections.max(count);
    }
    
    void dfs(int current, int currentCount){
        if(current >= 0){
            count.add(currentCount);
        }
        
        for(int i = 0 ; i < visited.length ; i++){
            if(!visited[i]){
                if(current >= dungeons[i][0]){
                    visited[i] = true;
                    dfs(current - dungeons[i][1], currentCount + 1);
                    visited[i] = false;
                }
            }
        }
    }
}