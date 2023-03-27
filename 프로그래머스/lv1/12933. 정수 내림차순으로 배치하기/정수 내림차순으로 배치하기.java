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
        
        String number = "";
        for(int i = 0; i < length; i++){
            number += (array[i]);         
        }
        answer = Long.parseLong(number);
        return answer;
    }
}
// import java.util.Arrays;
// import java.util.Comparator;
// class Solution {
//     public long solution(long n) {
//         long answer = 0; 
//         int length = (int)(Math.log10(n) + 1);
//         int[] array = new int[length];
        
//         for(int i = length - 1; i >= 0; i--){
//             long a = (long)n % 10;
//             array[i] = (int)a;
//             n = n / 10;
//         }
//         Integer[] tmp = Arrays.stream(array).boxed().toArray(Integer[]::new);
//         Arrays.sort(tmp, Comparator.reverseOrder());
//         long b= 1;
//         long a = 0;
//         for(int i = length-1; i >= 0; i--){
//             a += tmp[i] * b;
//             answer = a;
//             b *= 10;
//         }
//         return answer;
//     }
// }