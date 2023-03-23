class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int sum = 0;
        int num = 0;
        for(int i = 0; i < sides.length; i++){
            if(max < sides[i]){
                max = sides[i];
                num = i;
            }
        }
        for(int j = 0; j < sides.length; j++){
            if (num != j)
                sum += sides[j];
        }
        if (sum > max)
            answer = 1;
        else
            answer = 2;
        return answer;
    }
}