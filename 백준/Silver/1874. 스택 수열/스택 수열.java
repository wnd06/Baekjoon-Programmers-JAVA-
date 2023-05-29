import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int j = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int i = 1;
        while(j != N) {

            if(stack.isEmpty()){
                stack.push(i);
                i++;
                sb.append("+").append('\n');
            }
            else if(stack.peek() == arr[j]){
                stack.pop();
                j++;
                sb.append("-").append('\n');
            }
            else if(stack.peek() > arr[j]) {
                System.out.println("NO");
                break;
            }
            else {
                stack.push(i);
                i++;
                sb.append("+").append('\n');
            }
        }
        if(stack.isEmpty())
            System.out.println(sb);
    }
}