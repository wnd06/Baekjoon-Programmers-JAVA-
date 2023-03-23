class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        int length = (int)(Math.log10(n)+1);
        for(int i = 0; i < length; i++){
            num += (n % 10);
            n /= 10;
        }
        answer = num;
        return answer;
    }
}