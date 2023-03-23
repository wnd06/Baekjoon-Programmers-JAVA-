class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        // String str = "";
        // for (int i = 0; i < (str1.length()-str2.length())+1; i++){
        //     str = str1.substring(i, i + str2.length());
        //     if(str.equals(str2)){
        //         answer = 1;
        //         break;
        //     }
        //     else
        //         answer = 2;
        //}
        if(str1.contains(str2))
            answer = 1;
        else
            answer = 2;
        
        return answer;
    }
}