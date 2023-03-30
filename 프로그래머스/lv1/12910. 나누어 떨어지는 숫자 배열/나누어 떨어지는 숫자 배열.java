import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int temp;
        Arrays.sort(arr);
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr.length-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             temp = arr[j+1];
        //             arr[j+1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor == 0){
                count++;
            }
        }
        int j = 0;
        int[] answer = new int [count];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answer[j++] = arr[i];
            }
            else if (count == 0)
                return new int [] {-1};
        }
        return answer;
    }
}