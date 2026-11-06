import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();

        List<String[]> tempAnswer = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for(String r : record){
            String[] temp = r.split(" ");

            if(temp[0].equals("Enter") && !map.containsKey(temp[1])){
                map.put(temp[1], temp[2]);
                tempAnswer.add(new String[]{temp[1], temp[0]});
                continue;
            }

            if(temp[0].equals("Enter")){
                if(map.containsKey(temp[1])){
                    map.put(temp[1], temp[2]);
                }
                tempAnswer.add(new String[]{temp[1], temp[0]});
            }else if(temp[0].equals("Change")){
                map.put(temp[1], temp[2]);
            }else if(temp[0].equals("Leave")){
                tempAnswer.add(new String[]{temp[1], temp[0]});
            }
        }

        for (String[] info : tempAnswer){
            if(info[1].equals("Enter")){
                answer.add(map.get(info[0]) + "님이 들어왔습니다.");
            }else{
                answer.add(map.get(info[0]) + "님이 나갔습니다.");
            }
        }

        return answer.toArray(new String[0]);
    }
}