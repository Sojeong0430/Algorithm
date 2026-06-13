class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0,0};
        
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        for(int i = min ; i > 0 ; i--){
            if(min % i == 0 && max % i == 0){
                answer[0] = i;
                break;
            }
        }
        
        int max_count = max;
        
        while(true){
            if(max_count % max == 0 && max_count % min == 0){
                answer[1] = max_count;
                break;
            }else{
                max_count = max_count + max;
            }
        }
        
        return answer;
    }
}