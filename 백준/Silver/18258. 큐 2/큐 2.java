import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
            if(arr[i].equals("push")) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
            else if(arr[i].equals("pop")) {
                if(queue.isEmpty())
                    sb.append("-1").append('\n');
                else
                    sb.append(queue.poll()).append('\n');
            }
            else if(arr[i].equals("size")) {
                sb.append(queue.size()).append('\n');
            }
            else if(arr[i].equals("empty")) {
                if(queue.isEmpty())
                    sb.append("1").append('\n');
                else
                    sb.append("0").append('\n');
            }
            else if(arr[i].equals("front")) {
                if(queue.isEmpty())
                    sb.append("-1").append('\n');
                else
                    sb.append(queue.peek()).append('\n');
            }
            else if(arr[i].equals("back")) {

                if(queue.isEmpty())
                    sb.append("-1").append('\n');
                else
                    sb.append(queue.peekLast()).append('\n');

            }
        }
        System.out.println(sb);
    }
}