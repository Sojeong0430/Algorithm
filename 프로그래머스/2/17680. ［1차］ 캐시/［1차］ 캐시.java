import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        
        if(cacheSize == 0){
            return 5 * cities.length;
        }
        
        int index = 0;
        for(String city : cities){
            city = city.toLowerCase();
            if(map.containsKey(city)){
                result += 1;
                map.put(city, index);
            }else{
                if(map.size() < cacheSize){
                    map.put(city, index);
                    result += 5;
                }else {
                    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
                    list.sort(Map.Entry.comparingByValue());
                    map.remove(list.get(0).getKey());
                    map.put(city, index);
                    result += 5;
                }
            }
            index += 1;
        }
        return result;
    }
}