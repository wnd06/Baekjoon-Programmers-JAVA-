import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
            sum += d[i];
            if(sum > budget) {
                answer = i;
                break;
            }
            else if(sum == budget) {
                answer = i+1;
                break;
            }
            else if(sum < budget)
                answer = d.length;
                
            
        }
        
        return answer;
    }
}