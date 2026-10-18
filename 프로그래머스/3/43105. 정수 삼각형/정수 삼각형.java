import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        
        int treeLength = triangle.length;
        
        int[][] dp = new int[treeLength][treeLength];
        dp[0][0] = triangle[0][0];
        
        for(int length = 1 ; length < treeLength ; length ++){
            for(int index = 0 ; index <= length ; index ++){
                if(index > 0 && index < length){
                    dp[length][index] 
                        = Math.max(dp[length-1][index-1], dp[length-1][index]) 
                        + triangle[length][index];
                }else{
                    if(index == 0){
                        dp[length][index] = dp[length-1][0] + triangle[length][0];
                    }else if(index == length){
                        dp[length][index] = dp[length-1][index-1] + triangle[length][index];
                    }
                }
            }
        }
        
        int max = dp[treeLength - 1][0];
        for(int i = 0 ; i < treeLength ; i++){
            if(dp[treeLength - 1][i] > max){
                max = dp[treeLength - 1][i];
            }
        }
        return max;
    }
}