import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        int[] result = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = result.length -1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && numbers[i] >= stack.peek()){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }
            
            stack.push(numbers[i]);
        }
        
        return result;
    }
}