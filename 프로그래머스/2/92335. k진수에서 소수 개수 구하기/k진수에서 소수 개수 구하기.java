import java.util.*;

class Solution {
    
    int count = 0;
    
    public int solution(int n, int k) {
        String change = Integer.toString(n, k);
        String[] arr = change.split("0+");
        
        for(String s : arr){
            isPrime(Long.parseLong(s));
        }
        
        return count;
    }
    
    private void isPrime(long num){
        if(num < 2) return;
        
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0){
                return;
            }
        }
        count += 1;
    }
}