class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;
        
        for(int i = 0 ; i <= discount.length - 10 ; i++){
            int[] count = number.clone();
            
            for(int j = i ; j <= i + 9 ; j++){
                for(int k = 0 ; k < want.length ; k++){
                    if(discount[j].equals(want[k])){
                        count[k] -= 1;
                    }
                }
            }
            
            boolean ok = true;
            for (int k = 0; k < want.length; k++) {
                if (count[k] > 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) result++;
        }
        return(result);
    }
}