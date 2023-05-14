import java.util.*;
class Solution
{
    public int solution(String s)
    {
        
        char [] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        for(char ch : c) {
            if(stack.isEmpty())
                stack.push(ch);
            else if(stack.peek() == ch){
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        
        if(stack.isEmpty())
            return 1;
        else
            return 0;
        
    }
}