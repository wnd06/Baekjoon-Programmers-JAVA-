import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static int N, K;
    static int count = 1;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[100001];

        visited[N] = true;
        bfs(N);
        System.out.println(arr[K]);
    }

    public static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        arr = new int[100001];
        arr[node] = 0;

        while(!q.isEmpty()) {

            int num = q.poll();

            int[] arr_1 = {num + 1, num - 1, num * 2};

            if(num == K)
                return;

            for (int i = 0; i < 3; i++) {
                int next = arr_1[i];
                if(next < 0 || next >= 100001)
                    continue;
                if (visited[next])
                    continue;

                q.add(next);
                arr[next] = arr[num] + 1;
                visited[next] = true;
            }
        }
    }
}
