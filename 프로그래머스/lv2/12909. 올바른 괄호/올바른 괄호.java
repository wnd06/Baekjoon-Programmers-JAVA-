import java.util.*;

class Solution {
    boolean solution(String s) {
       
        Stack<Character> stack = new Stack<>();
        char [] ch = s.toCharArray();
        
        if(s.charAt(0) == ')')
            return false;

        for(char c : ch){
            if(stack.isEmpty())
                stack.push(c);
            else if(c == '('){
                stack.push(c);
            }
            else {
                stack.pop();
            }
        }
        
        if(!stack.isEmpty())
            return false;
        return true;
    }
}