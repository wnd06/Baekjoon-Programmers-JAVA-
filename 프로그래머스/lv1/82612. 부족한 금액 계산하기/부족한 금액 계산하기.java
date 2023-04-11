class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long won = 0;
        for(int i = 1; i <= count; i++){
            won += price * i;
        }
        answer = won - money;
        if (won < money)
            return 0;
        return answer;
    }
}