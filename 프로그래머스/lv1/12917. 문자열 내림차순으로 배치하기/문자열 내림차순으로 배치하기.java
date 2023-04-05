import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char [] arr_2 = new char [s.length()];
        char [] arr = new char [s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        int j = 0;
        for(int i = arr.length-1; i >= 0; i--){
            arr_2[j] = arr[i];
            j++;
        }
        
        answer = String.valueOf(arr_2);
        return answer;
    }
}