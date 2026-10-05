import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int count = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0 ; i < priorities.length ; i++){
            queue.offer(i);
        }
        
        while(true){
            int status = 0;
            int currentProcess = queue.poll();
            int currentPriority = priorities[currentProcess];
            
            for(int processIndex : queue){
                if(currentPriority < priorities[processIndex]){
                    queue.offer(currentProcess);
                    status = 1;
                    break;
                }
            }
            
            if(status == 1){
                continue;
            }else{
                count += 1;
            }
            
            if(currentProcess == location){
                break;
            }
        }
        
        return count;
    }
}