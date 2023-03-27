class Solution {
    public int solution(String s) {
        int answer = 0;
        int num = 0;
        int b = 1;
        for(int i = s.length()-1; i >= 0; i--){
            
            if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                num += (s.charAt(i) - '0') * b;
                b = b * 10;
            }
            else if(s.charAt(i) == '-')
                num = num * -1;
            else if(s.charAt(i) == '+')
                num = num * +1;
        }
        answer = num;
        return answer;
    }
}