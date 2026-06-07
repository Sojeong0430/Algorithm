import java.util.Arrays;

class Solution {
    
    int[] mainArray;
    
    public int[] solution(int[] array, int[][] commands) {
        mainArray = array;
        int[] answer = new int[commands.length];
        
        for(int i = 0 ; i < commands.length; i++){
            answer[i] = process(commands[i]); 
        }
        
        return answer;
    }
    
    private int process(int[] item){
        int[] newArray = Arrays.copyOfRange(mainArray, item[0]-1, item[1]);
        Arrays.sort(newArray);
        
        return newArray[item[2]-1];
    }
}