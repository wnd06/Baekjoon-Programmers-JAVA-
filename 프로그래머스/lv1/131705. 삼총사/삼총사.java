class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j< number.length; j++){
                int sum_2 = number[i] + number[j];
                for(int a = j + 1; a < number.length; a++){
                    if(sum_2 + number[a] == 0)
                        answer++;
                }
            }
        }
        return answer;
    }
}