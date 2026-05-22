class Solution {
    
    int answer = 0;
    int[] numbers;
    int target;
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        dfs(0,0);
            
        return answer;
    }
    
    private void dfs(int index, int sum){
        if(index == numbers.length){
            if(sum == target){
                answer ++;
            }
            return;
        }
        
        dfs(index+1, sum + numbers[index]);
        dfs(index+1, sum - numbers[index]);
    }
}