class Solution {
    public String solution(String myString, String pat) {
        
        int endIndex = myString.indexOf(pat) + pat.length() - 1;
        int plusIndex = 1;
        
        while((endIndex + plusIndex) < myString.length()){
            String current = myString.substring(0, endIndex + plusIndex + 1);
            if(current.endsWith(pat)){
                endIndex += plusIndex;
                plusIndex = 1;
                continue;
            }
            plusIndex += 1;
        }
        
        return myString.substring(0, endIndex + 1);
    }
}