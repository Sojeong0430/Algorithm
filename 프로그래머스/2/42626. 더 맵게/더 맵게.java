import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        int count = 0;
        boolean status = false;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0 ; i < scoville.length ; i++){
            pq.offer(scoville[i]);
            if(scoville[i] < K){
                status = true;
            }
        }
        
        if(status == false){
            return 0;
        }
        
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            int newSco = first + second * 2;
            pq.offer(newSco);
            
            count += 1;
            
            if(pq.peek() >= K){
                return count;
            }
        }
        
        return -1;
    }
}