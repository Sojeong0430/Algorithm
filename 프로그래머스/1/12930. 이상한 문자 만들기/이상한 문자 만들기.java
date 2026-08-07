import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int index = 1;
        int flag = 0;
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                sb.append(c);
                flag = 0;
            }else{
                if(flag == 0){
                    flag = 1;
                    index = 1;
                    sb.append(process(index, c));
                    index ++;
                }else if(flag == 1){
                    sb.append(process(index, c));
                    index ++;
                }
            }
        }
        
        return sb.toString();
    }
    
    private char process(int index, char c){
        if(index % 2 == 0){
            return Character.toLowerCase(c);
        }else{
            return Character.toUpperCase(c);
        }
    }
}