import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M, R;
    static ArrayList<Integer>[] list;
    static boolean[] visited;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];
        visited = new boolean[N+1];

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        for (int i = 0; i < list.length; i++) {
            Collections.sort(list[i]);
        }

        dfs(R);
        sb.append('\n');
        visited = new boolean[N+1];
        bfs(R);

        System.out.println(sb);
    }

    public static void dfs(int node) {

        visited[node] = true;
        sb.append(node).append(" ");

        for (int next : list[node]) {
            if(!visited[next])
                dfs(next);
        }
    }

    public static void bfs(int node) {
        Deque<Integer> queue = new LinkedList<>();

        visited[node] = true;
        queue.add(node);

        while(queue.size() != 0) {
            int num = queue.poll();
            sb.append(num).append(" ");
            for (int next : list[num]) {
                if(!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

    }
}
