import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        Integer[] nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        
        Arrays.sort(nums, (a, b) -> (b + "" + a).compareTo(a + "" + b));
        
        StringBuilder sb = new StringBuilder();
        for(int n : nums){
            sb.append(String.valueOf(n));
        }
        
        String result = sb.toString();
        
        if(result.startsWith("0")){
            return "0";
        }
        
        return result;
    }
}