class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        // for (int i = 0; i < numbers.length; i++){
        //     answer += numbers[i];
        // }
        // answer /= numbers.length; 
        // return answer;
        
        for (int x : numbers)
            answer += x;
        answer /= numbers.length;
        
        return answer;
        
        
    }
}