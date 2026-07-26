import java.util.*;

class Solution {
    
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] count = new int[3];
        
        int[] stu1 = {1, 2, 3, 4, 5};
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        count[0] = grading(stu1, answers);
        count[1] = grading(stu2, answers);
        count[2] = grading(stu3, answers);
        
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            if (count[i] == max) {
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private int grading(int[] style, int[] answers){
        int index = 0, count = 0;
        for(int a : answers){
            if(a == style[index]){
                count ++;
            }
            index ++;
            if(index == style.length){
                index = 0;
            }
        }
        return count;
    }
}