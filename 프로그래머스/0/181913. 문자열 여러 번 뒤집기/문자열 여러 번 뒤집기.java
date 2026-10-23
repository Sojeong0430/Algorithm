class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append(c);
        }
        
        for(int[] i : queries){
            int front = i[0];
            int back = i[1];
            while(front < back){
                char frontChar = sb.charAt(front);
                char backChar = sb.charAt(back);
                sb.setCharAt(front, backChar);
                sb.setCharAt(back, frontChar);
                front += 1;
                back -= 1;
            }
        }
        
        return sb.toString();
    }
}