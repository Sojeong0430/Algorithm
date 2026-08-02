import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<Integer> numberList = new ArrayList<>();
        
        for(int num : numbers){
            numberList.add(num);
        }
        
        numberList.sort((a, b) ->
           (String.valueOf(b) + String.valueOf(a))
                .compareTo(String.valueOf(a) + String.valueOf(b))
        );
        
        String answer = "";
        
        for(int i : numberList){
            answer += String.valueOf(i);
        }
        
        if(answer.charAt(0) == '0'){
            answer = "0";
        }
        
        return answer;
    }
}