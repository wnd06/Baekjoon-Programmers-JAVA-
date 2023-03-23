class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String str_1 : s1){
            for(String str_2 : s2){
                if(str_1.equals(str_2))
                    answer++;
            }
        }
        return answer;
    }
}