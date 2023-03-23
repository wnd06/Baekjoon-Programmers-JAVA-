class Solution {
    public int[] solution(long n) {
        int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++){
            long num = (long)n % 10;
            answer[i] = (int)num;
            n = n / 10;
        }
        return answer;
    }
}