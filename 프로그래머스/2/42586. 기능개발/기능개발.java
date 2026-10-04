import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int current = 0;
        List<Integer> list = new ArrayList<>();
        
        while(current < progresses.length){
            for(int i = current ; i < progresses.length ; i++){
                progresses[i] += speeds[i];
            }
            
            int d = deploy(current, progresses);
            if(d!=0){
                list.add(d);
                current += d;
            }
        }
        
        int[] arr = list.stream()
                .mapToInt(i -> i)
                .toArray();
        
        return arr;
    }
    
    private int deploy(int current, int[] progresses){
        if(current >= progresses.length){
            return 0;
        }
        
        if(progresses[current] >= 100){
            return 1 + deploy(current + 1, progresses);
        }else{
            return 0;
        }
    }
}