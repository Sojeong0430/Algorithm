import java.util.*;

class Solution {
    boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length() - 1) == '('){
            return false;
        }
        
        char[] array = s.toCharArray();
        
        int count = 0;
        
        for(int i = array.length - 1 ; i >= 0 ; i-- ){
            if(array[i] == ')'){
                count += 1;
            }else{
                count -= 1;
            }
            
            if(count < 0){
                return false;
            }
        }
        
        if(count == 0){
            return true;
        }else{
            return false;
        }
    }
}