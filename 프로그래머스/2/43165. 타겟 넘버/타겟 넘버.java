import java.util.*;

class Solution {
    
    int[] numbers;
    int count = 0;
    int target;
        
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        dfs(0, 0);
        
        return count;
    }
    
    void dfs(int current, int length){
        if(length == numbers.length){
            if(current == target){
                count += 1;
                return;
            }else{
                return;
            }
        }
        
        dfs(current + numbers[length], length + 1);
        dfs(current - numbers[length], length + 1);
    }
}