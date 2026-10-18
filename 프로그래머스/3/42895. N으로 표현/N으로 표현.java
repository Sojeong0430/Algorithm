import java.util.*;

class Solution {
    public int solution(int N, int number) {
        Set<Integer>[] dp = new HashSet[9];
        dp[0] = new HashSet<Integer>();
        
        for(int i = 1 ; i < 9 ; i++){
            dp[i] = new HashSet<Integer>();
            
            int repeated = 0;
            for(int k = 0 ; k < i ; k++){
                repeated = repeated * 10 + N;
            }
            dp[i].add(repeated);
            
            for(int n = 1 ; n < i ; n++){
                for(int j : dp[n]){
                    for(int k : dp[i-n]){
                        dp[i].add(j + k);
                        dp[i].add(j - k);
                        dp[i].add(j * k);
                        if(k != 0){
                            dp[i].add(j / k);
                        }
                    }
                }
            }
            if(dp[i].contains(number)){
                return i;
            }
        }
        return -1;
    }
}