class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String a = "";
        int length = phone_number.length() - 4;
        answer = phone_number.substring(length);
        for(int i = 0; i < length; i++){
            a += "*";
        }
        return a + answer;
    }
}