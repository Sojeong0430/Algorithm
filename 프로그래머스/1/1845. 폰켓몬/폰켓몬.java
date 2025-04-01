import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int fullEntry = nums.length/2;
        
        HashSet<Integer> uniquePokemon = new HashSet<>();
        for(int p:nums){
            uniquePokemon.add(p);
        }
        
        return Math.min(uniquePokemon.size(),fullEntry);
    }
}