import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            if(stack.isEmpty())
                stack.push(arr[i]);
            else if(arr[i] == 0)
                stack.pop();
            else
                stack.push(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        System.out.println(sum);
    }
}
