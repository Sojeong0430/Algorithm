import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        
        int[] st1 = {1,2,3,4,5};
        int[] st2 = {2,1,2,3,2,4,2,5};
        int[] st3 = {3,3,1,1,2,2,4,4,5,5};
        
        score[0] = process(answers, st1);
        score[1] = process(answers, st2);
        score[2] = process(answers, st3);
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        List<Integer> people = new ArrayList<>();
        
        for(int i = 0 ; i < 3 ; i++){
            if(score[i] == max){
                people.add(i+1);
            }
        }
        
        return people.stream().mapToInt(i -> i).toArray();
    }
    
    private int process(int[] answers, int[] st){
        int count = 0;
        int index = 0;
        for(int answer : answers){
            if(index == st.length){
                index = 0;
            }
            if(answer == st[index]){
                count++;
            }
            index ++;
        }
        return count;
    }
}