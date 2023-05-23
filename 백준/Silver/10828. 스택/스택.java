import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int []stack;
    static int size = 0;
    public static void push(int n) {
        stack[size] = n;
        size++;
    }
    public static int pop() {

        if(size == 0)
            return -1;
        else{
            int res = stack[size - 1];
            stack[size-1] = 0;
            size--;
            return res;
        }
    }
    public static int Empty() {
        if(size == 0)
            return 1;
        else
            return 0;
    }
    public static int size() {
        return size;
    }

    public static int top() {
        if(size == 0)
            return -1;
        else
            return stack[size-1];
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        stack = new int[N];
        String[] arr = new String [N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
            if(arr[i].equals("push")) {
                push(Integer.parseInt(st.nextToken()));
            }
            else if(arr[i].equals("pop")){
                sb.append(pop()).append('\n');
            }
            else if(arr[i].equals("size")) {
                sb.append(size()).append('\n');
            }
            else if(arr[i].equals("empty")){
                sb.append(Empty()).append('\n');
            }
            else if(arr[i].equals("top")){
                sb.append(top()).append('\n');
            }

        }
        System.out.println(sb);
    }
}