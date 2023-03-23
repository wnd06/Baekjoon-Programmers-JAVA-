class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            my_string = my_string.replace("a","");
            my_string = my_string.replace("e","");
            my_string = my_string.replace("i","");
            my_string = my_string.replace("o","");
            my_string = my_string.replace("u","");
        }
        answer = my_string;
        return answer;
    }
}