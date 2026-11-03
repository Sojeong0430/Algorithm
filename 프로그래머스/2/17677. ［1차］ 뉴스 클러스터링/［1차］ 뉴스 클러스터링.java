import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        String[] str1Arr = process(str1);
        String[] str2Arr = process(str2);
        
        if(str1Arr.length == 0 && str2Arr.length == 0){
            return 1 * 65536;
        }
        return J(str1Arr, str2Arr);
    }
    
    private String[] process(String str){
        str = str.toLowerCase();
        
        if(str.length() < 2){
            return new String[0];
        }

        List<String> list = new ArrayList<>();

        for(int i = 0; i < str.length() - 1; i++){
            String s = str.substring(i, i + 2);

            if(s.matches("[a-z]{2}")){
                list.add(s);
            }
        }

        return list.toArray(new String[0]);
    }
    
    private int J(String[] str1, String[] str2){
        HashMap<String, Integer> str1Map = new HashMap<>();
        HashMap<String, Integer> str2Map = new HashMap<>();
        
        for(String s : str1){
            str1Map.put(s, str1Map.getOrDefault(s, 0) + 1);
        }
        for(String s : str2){
            str2Map.put(s, str2Map.getOrDefault(s, 0) + 1);
        }
        
        // 합집합
        int sum = 0;
        for(String key : str1Map.keySet()){
            if(str2Map.containsKey(key)){
                sum += Math.max(str1Map.get(key), str2Map.get(key));
            }else{
                sum += str1Map.get(key);
            }
        }
        for(String key : str2Map.keySet()){
            if(str1Map.containsKey(key)){
                continue;
            }else{
                sum += str2Map.get(key);
            }
        }
        
        // 교집합
        int cross = 0;
        for(String key : str1Map.keySet()){
            if(str2Map.containsKey(key)){
                cross += Math.min(str1Map.get(key), str2Map.get(key));
            }else{
                continue;
            }
        }
        
        if(sum == 0){
            return 1;
        }else{
            return (int)(((double)cross/sum) * 65536);
        }
    }
}