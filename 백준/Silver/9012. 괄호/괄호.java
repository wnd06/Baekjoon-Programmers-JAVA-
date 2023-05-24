import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack;
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            char[] chs = arr[i].toCharArray();
            stack = new Stack<>();

            for (int j = 0; j < chs.length; j++) {

                if(stack.isEmpty()) {
                    stack.push(chs[j]);
                    if(chs[j] == ')') {
                        stack.push(chs[j]);
                        break;
                    }
                }
                else if(chs[j] == '(') {
                    stack.push(chs[j]);
                    
                }
                else {
                    stack.pop();
                    
                }
            }
            if(stack.isEmpty())
                sb.append("YES").append('\n');
            else
                sb.append("NO").append('\n');
        }
        System.out.println(sb);

    }
}
