
import java.util.*;

class Solution {
    int[][] dp;

    int solution(int[][] land) {
        dp = new int[land.length][4];

        int first = -1;
        int second = -1;

        for(int j = 0; j < 4; j++){
            dp[0][j] = land[0][j];
        }

        for(int j = 0; j < 4; j++){
            if(first == -1 || dp[0][j] > dp[0][first]){
                second = first;
                first = j;
            }else if(second == -1 || dp[0][j] > dp[0][second]){
                second = j;
            }
        }

        for(int i = 1; i < land.length; i++){
            for(int k = 0; k < 4; k++){
                if(k != first){
                    dp[i][k] = dp[i-1][first] + land[i][k];
                }else{
                    dp[i][k] = dp[i-1][second] + land[i][k];
                }
            }

            first = -1;
            second = -1;

            for(int j = 0; j < 4; j++){
                if(first == -1 || dp[i][j] > dp[i][first]){
                    second = first;
                    first = j;
                }else if(second == -1 || dp[i][j] > dp[i][second]){
                    second = j;
                }
            }
        }

        int result = dp[land.length - 1][0];
        
        for(int i = 1; i < 4; i++){
            result = Math.max(result, dp[land.length - 1][i]);
        }

        return result;
    }
}
