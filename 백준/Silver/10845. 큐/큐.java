import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] Queue;
    static int size = 0;
    static int idx = 0;
    public static void push(int n) {
        Queue[size] = n;
        size++;
    }
    public static int pop() {

        if(size == 0)
            return -1;
        else {
            int res = Queue[0];

            for (int i = 1; i < size; i++) {
                Queue[i-1] = Queue[i];
            }
            size--;
            return res;
        }
    }
    public static int size() {
        return size;
    }
    public static int empty() {
        if(size == 0) return 1;
        else return 0;
    }

    public static int front() {
        if(size == 0) return -1;
        else {
            return Queue[0];
        }
    }

    public static int back() {
        if(size == 0) return -1;
        else {
            return Queue[size-1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Queue = new int[N];
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
            if(arr[i].equals("push")) {
                push(Integer.parseInt(st.nextToken()));
            }
            else if(arr[i].equals("pop")) {
                sb.append(pop()).append('\n');
            }
            else if(arr[i].equals("size")) {
                sb.append(size()).append('\n');
            }
            else if(arr[i].equals("empty")) {
                sb.append(empty()).append('\n');
            }
            else if(arr[i].equals("front")) {
                sb.append(front()).append('\n');
            }
            else if(arr[i].equals("back")) {
                sb.append(back()).append('\n');
            }

        }
        System.out.println(sb);
    }
}