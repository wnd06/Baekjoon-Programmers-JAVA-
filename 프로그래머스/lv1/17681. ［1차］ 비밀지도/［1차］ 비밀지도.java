
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        for(int i = 0; i < n; i++){
            answer[i] = "";
            String a = Integer.toBinaryString(arr1[i] | arr2[i]);
            // if(a.length() != n){
            //     for(int k = 0; k < n - a.length(); k++){
            //         a = '0' + a;
            //     }
            // }
            a = "0".repeat(n-a.length()) + a;
            for(int j = 0; j < a.length(); j++){
                if(a.charAt(j) == '1')
                    answer[i] += '#';
                else if(a.charAt(j) == '0')
                    answer[i] += ' ';
            }
        }
        
        return answer;
    }
}