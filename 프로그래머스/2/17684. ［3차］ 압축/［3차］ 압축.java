import java.util.*;

class Solution {
    public int[] solution(String msg) {
        String[] arr = new String[]{
            "A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z"
            };
        Map<String, Integer> dic = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            dic.put(arr[i], i + 1);
        }
        
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        
        while (count < msg.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(msg.charAt(count));
            
            while (count + 1 < msg.length()) {
                String next = sb.toString() + msg.charAt(count + 1);
                
                if (dic.containsKey(next)) {
                    count++;
                    sb.append(msg.charAt(count));
                } else {
                    break;
                }
            }
            
            answer.add(dic.get(sb.toString()));
            
            if (count + 1 < msg.length()) {
                dic.put(sb.toString() + msg.charAt(count + 1), dic.size() + 1);
            }
            
            count++;
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}