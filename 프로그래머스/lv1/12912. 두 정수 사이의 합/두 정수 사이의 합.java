class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp;
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }
        long length = b - a + 1;
        long sum = 0;
        
        for(int i = 0; i<length; i++){
            sum += a;
            a++;
        }
        answer = sum;
        return answer;
    }
}