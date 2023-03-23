class Solution {
    public int solution(String s) {
        int answer = 0;
        int num = 1;
        for(int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == 45){
                answer = answer * -1;
                break;
            }
            if(s.charAt(i) == 43){
                answer = answer * +1;
                break;
            }
            answer += (s.charAt(i) - '0') * num;
            num *= 10;
            
        }
        //return Integer.valueOf(s);
        return answer;
    }
}