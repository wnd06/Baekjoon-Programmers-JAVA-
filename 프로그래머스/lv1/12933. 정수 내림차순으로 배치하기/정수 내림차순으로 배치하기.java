class Solution {
    public long solution(long n) {
        long answer = 0; 
        int length = (int)(Math.log10(n) + 1);
        int[] array = new int[length];
        int temp;
        
        for(int i = length - 1; i >= 0; i--){
            long a = (long)n % 10;
            array[i] = (int)a;
            n = n / 10;
        }
        for(int j =0; j< length; j++)
            {
            for (int i = 0; i < length-1; i++){
                if(array[i] < array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        }
        long num = 1;
        long number = 0;
        for(int i = length-1; i >= 0; i--){
            number += (array[i] * num);
            num *= 10;
        }
        answer = number;
        return answer;
    }
}