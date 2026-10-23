class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
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