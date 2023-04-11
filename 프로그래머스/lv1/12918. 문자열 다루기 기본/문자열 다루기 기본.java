class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        if(s.length() == 4 || s.length() == 6) {
            for(int i = 0; i < s.length(); i++){
                if ('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                    count++;
                }
            }
            if(count != s.length()){
                answer = false;
            }
        }
        else
            answer=false;
        
        
        
        return answer;
    } 
}