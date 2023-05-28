import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack;

        while(true){
            String s= br.readLine();
            stack = new Stack<>();
            if(s.equals(".")) {
                break;
            }
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                }
                else if (s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                }
                else if (s.charAt(i) == ')') {
                    if(stack.isEmpty() || stack.peek() != '(')
                        stack.push(s.charAt(i));
                    else stack.pop();
                }
                else if (s.charAt(i) == ']') {
                    if(stack.isEmpty() || stack.peek() != '[')
                        stack.push(s.charAt(i));
                    else stack.pop();
                }
            }
            if(stack.isEmpty())
                sb.append("yes").append('\n');
            else
                sb.append("no").append('\n');
        }
        System.out.println(sb);
    }
}