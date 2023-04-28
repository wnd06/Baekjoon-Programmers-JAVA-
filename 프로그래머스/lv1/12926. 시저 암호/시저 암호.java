class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] chs = s.toCharArray();
        for(char i : chs){
            if (i == ' ')
                answer += (char)i;
            else if(i >= 'a' && i <= 'z'){
                if(i + n > 'z')
                    answer += (char)(i + n - 26);
                else
                    answer += (char)(i + n);
            }
            else if(i >= 'A' && i <= 'Z'){
                if(i + n > 'Z')
                    answer += (char)(i + n - 26);
                else
                    answer += (char)(i + n);
            }
            else
                answer += (char)(i + n);
        }
        return answer;
    }
}