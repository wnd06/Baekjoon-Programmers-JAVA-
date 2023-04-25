import java.util.*;
class Solution {
    public int solution(int n) {
        String str = "";
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        String r = Integer.toString(n, 3);
        for(int i = 0; i < r.length(); i++){
            if(stack.isEmpty())
                stack.push(r.charAt(i));
            else
                stack.push(r.charAt(i));
        }
        for(int i = 0; i < r.length(); i++){
            str += stack.pop();
        }
       
        answer = Integer.parseInt(str, 3);
        return answer;
    }
}