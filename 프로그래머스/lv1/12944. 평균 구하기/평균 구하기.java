class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        int count = 0;
        for(int x : arr){
            sum += x;
            count++;
        }
        answer = (double)sum / count;
        return answer;
    }
}