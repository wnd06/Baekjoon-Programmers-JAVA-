class Solution {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        long num = (long)x;
        
        if(num == x){
            
            answer = (long)Math.pow(num + 1, 2);
        }
        else
            answer = -1;
        
        return answer;
    }
}