import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Arrays.sort(strArr, Comparator.comparingInt(String::length));
        
        int max = -1;
        int length = strArr[0].length();
        int count = 1;
        
        for(int i = 1 ; i < strArr.length ; i++){
            if(strArr[i].length() == length){
                count += 1;
            }else if(strArr[i].length() > length){
                if(count > max){
                    max = count;
                }
                count = 1;
                length = strArr[i].length();
            }
        }
        
        if(count > max){
            max = count;
        }
        
        return max;
    }
}