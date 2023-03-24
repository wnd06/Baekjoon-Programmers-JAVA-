class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int length = (int)(Math.log10(x)+1);
        int sum = 0;
        int num = x;
        for(int i = 0; i < length; i++){
            sum += x%10;
            x /= 10;
        }
        if (num % sum != 0)
            answer = false;
        return answer;
    }
}