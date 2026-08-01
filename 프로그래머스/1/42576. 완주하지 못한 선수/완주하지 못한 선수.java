import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(String name : completion){
            hash.put(name, hash.getOrDefault(name, 0) + 1);
        }
        
        for(String name : participant){
            if(hash.containsKey(name)){
                if(hash.get(name) == 0){
                    return name;
                }else{
                    hash.put(name, hash.get(name) - 1);
                }
            }else{
                return name;
            }
        }
        
        return null;
    }
}