class Solution {
    public int solution(int n) {
        int answer = 0;
        int min = n;
        for(int i = n; i >= 1; i--){
            int a = n % i;
            if(a == 1){
                if(min > i)
                    min = i;
            }
        }
        answer = min;
        return answer;
    }
}