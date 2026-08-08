import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        for(int i = 0 ; i < strings.length ; i++){
            char temp = (strings[i]).charAt(n);
            String newStr = temp + strings[i];
            strings[i] = newStr;
        }
        
        Arrays.sort(strings);
        
        for(int i = 0 ; i < strings.length ; i++){
            String newStr = strings[i].substring(1, strings[i].length());
            strings[i] = newStr;
        }
        
        return strings;
    }
}