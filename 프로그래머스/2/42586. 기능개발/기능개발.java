import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList();
        Stack<Integer> leftFeature = new Stack<>();
        int[] leftDays = new int[progresses.length];
        int maxLeftDays = 0;
        
        for(int i = 0 ; i < progresses.length ; i++){
            leftDays[i] = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            if (leftDays[i]  > maxLeftDays){
                maxLeftDays = leftDays[i];
            }
        }
        
        for(int i = progresses.length - 1 ; i >= 0 ;i--){
            leftFeature.push(leftDays[i]);
        }

        for(int i = 1 ; i <= maxLeftDays ; i++){
            if(leftFeature.size() == 0){
                break;
            }
            
            int count = 0;
            
            if(leftFeature.peek() == i){
                leftFeature.pop();
                count ++;
                while(true){
                    if(leftFeature.size() == 0){
                        break;
                    }
                    
                    if(leftFeature.peek() <= i){
                        leftFeature.pop();
                        count++;
                    }else{
                        break;
                    }
                }
                answer.add(count);
            }
        }
        
        int[] result = new int[answer.size()];
        
        for(int i = 0 ; i < answer.size() ; i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}