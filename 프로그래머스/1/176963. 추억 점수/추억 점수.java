import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int[] result = new int[photo.length];
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < name.length ; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i = 0 ; i < photo.length ; i++){
            int count = 0;
            for(String n : photo[i]){
                if(map.get(n) != null){
                    count += map.get(n);
                }
            }
            result[i] = count;
        }
        
        return result;
    }
}