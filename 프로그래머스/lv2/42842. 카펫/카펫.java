import java.util.ArrayList;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum_2 = brown + yellow;
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 1; i <= sum_2; i++){
            if(sum_2 % i == 0){
                list.add(i);
            }
        }
        for(int i = 2; i <= sum_2; i++) {
            if(list.contains(i)){
                if ((i >= (sum_2/i)) && ((i-2) * ((sum_2/i)-2) == yellow)) {
                    answer[0] = i;
                    answer[1] = sum_2/i;
                    break;
                }
            }
        }
    
        
        
        return answer;
    }
    
}