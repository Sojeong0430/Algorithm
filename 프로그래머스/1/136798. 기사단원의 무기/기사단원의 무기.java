class Solution {
    public int solution(int number, int limit, int power) {
        int count = 0;
        int[] attackPower = new int[number+1];
        for(int i = 1 ; i <= number ; i++){
            attackPower[i] = divisor(i, limit);
            if(attackPower[i] > limit){
                count += power;
            }else{
                count += attackPower[i];
            }
        }
        return count;
    }
    
    private int divisor(int number, int limit){
        int count = 0;
        for(int i = 1 ; i <= number ; i++){
            if(number % i == 0){
                count ++;
            }
            if(count > limit){
                return count;
            }
        }
        return count;
    }
}