class Solution {
    public int solution(int n) {
        
        long num=n;
        int cnt=0;
        
        for(;num!=1 && cnt<=500;cnt++)
            num=((num&1)==0)?num/2:num*3+1;
        
        return cnt>500?-1:cnt;
    }
}
