import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String newArray[] = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(newArray, (a,b) -> (b+a).compareTo(a+b));
        
        StringBuilder sb = new StringBuilder();
        
        for(String s: newArray){
            sb.append(s);
        }
        
        if(sb.charAt(0) == '0'){
            return "0";
        }
        
        return sb.toString();
    }
}