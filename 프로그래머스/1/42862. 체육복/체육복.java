import java.util.*;

class Solution {
    
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int count = n - lost.length;
        
        HashMap<Integer, Integer> reserveMap = new HashMap<>();
        for(int i : reserve){
            reserveMap.put(i, 2);
        }
        
        List<Integer> lostList = new ArrayList<>();
        for(int i : lost){
            lostList.add(i);
        }
        
        for(int i : lost){
            if(reserveMap.containsKey(i)){
                reserveMap.remove(i);
                lostList.remove(Integer.valueOf(i));
                count += 1;
            }
        }
        
        for(int i : lostList){
            if(reserveMap.containsKey(i-1)){
                reserveMap.remove(i-1);
                count += 1;
            }else if(reserveMap.containsKey(i+1)){
                reserveMap.remove(i+1);
                count += 1;
            }
        }
        
        return count;
    }
}