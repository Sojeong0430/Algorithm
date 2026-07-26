import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[][] result = new int[N+2][2];
        double[] failValue = new double[N+1];
        
        for(int stage: stages){
            result[stage][1] ++; 
            for(int i = 1; i <= stage; i++){
                result[i][0]++;
            }
        }
        
        for(int stage = 1 ; stage <= N ; stage++){
            if(result[stage][0] == 0){
                failValue[stage] = 0;
            }else{
                failValue[stage] = (double) result[stage][1] / result[stage][0];
            }
        }
        
        Integer[] stageNum = new Integer[N];
        
        for (int i = 0; i < N; i++) {
            stageNum[i] = i + 1;
        }
        
        Arrays.sort(stageNum, (a, b) -> {
            if (Double.compare(failValue[a], failValue[b]) == 0) {
                return a - b;
            }
            return Double.compare(failValue[b], failValue[a]);
        });
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageNum[i];
        }

        return answer;
    }
} 