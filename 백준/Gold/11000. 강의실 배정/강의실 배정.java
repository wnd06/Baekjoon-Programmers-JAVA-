import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1])
                return o1[0] - o2[0];
            else
                return o1[0] - o2[0];
        });
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(arr[0][1]);
        for (int i = 1; i < N; i++) {
            if(q.peek() <= arr[i][0]){
                q.poll();
            }
            q.add(arr[i][1]);

        }
        System.out.println(q.size());
    }

}


