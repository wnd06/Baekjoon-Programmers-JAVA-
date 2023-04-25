import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr){
            if(stack.isEmpty())
                stack.push(i);
            else if(stack.peek() != i)
                stack.push(i);
        }
        int j = 0;
        answer = new int [stack.size()];
        for(int i : stack){
            answer[j] = i;
            j++;
        }

        return answer;
    }
}