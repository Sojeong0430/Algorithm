import java.util.*;

class Solution {
    int count = 0;
    int answer = 0;
    String word;
    char[] alphabet = new char[]{'A', 'E', 'I', 'O', 'U'};
    
    public int solution(String word) {
        this.word = word;
        dfs("");
        return answer;
    }
    
    void dfs(String str){
        if(str.equals(word)){
            answer = count;
        }
        
        for(int i = 0 ; i < alphabet.length ; i++){
            if(str.length() < 5){
                count += 1;
                dfs(str + alphabet[i]);
            }
        }
    }
}