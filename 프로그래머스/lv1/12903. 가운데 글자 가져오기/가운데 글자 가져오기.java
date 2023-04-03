class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i= 0; i < s.length(); i++){
            int a = s.length()/2+1;
            answer=s.substring(a-1, a);
            if(s.length() % 2 == 0)
                answer = s.substring(a-2, a);
        }
        return answer;
    }
}