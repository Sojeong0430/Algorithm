import java.util.*;

class Solution {
    
    Set<Integer> set = new HashSet<>();
    boolean[] visited;
    String numbers;
    
    public int solution(String numbers) {
        this.numbers = numbers;
        visited = new boolean[numbers.length()];
        int result = 0;
        
        dfs("");
        
        for(int num : set){
            if(isPrime(num)){
                result ++;
            }
        }
        
        return result;
    }
    
    void dfs(String str){
        if(!str.isEmpty()){
            set.add(Integer.parseInt(str));
        }
        
        for(int i = 0 ; i < numbers.length() ; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(str + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }
    
    boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        
        if(num == 2){
            return true;
        }
        
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
}