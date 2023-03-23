class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int num_1 = 0;
        int num_2= 0;
        for(int i = 0; i < s.length(); i++){
            if('p' == s.charAt(i) || 'P' == s.charAt(i)){
                num_1 += 1;
            }
            else if('y' == s.charAt(i) || 'Y' == s.charAt(i)){
                num_2 += 1;
            }
        }
        if(num_1 != num_2)
            answer = false;

        return answer;
    }
}