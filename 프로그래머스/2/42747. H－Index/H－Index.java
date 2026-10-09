import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[citations.length - 1 - i];
            citations[citations.length - 1 - i] = temp;
        }
        
        int maxH = citations.length;
        
        for(int i = maxH ; i >= 0 ; i--){
            int count = 0;
            for(int c : citations){
                if(c >= i){
                    count ++;
                    if(count == i){
                        return i;
                    }
                }else{
                    break;
                }
            }
        }
        return 0;
    }
}