class Solution {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        long num_2 = (long)num;
        if (num_2 == num)
            answer = (num_2 + 1) * (num_2 + 1);
        else
            answer = -1;
        return answer;
    }
}