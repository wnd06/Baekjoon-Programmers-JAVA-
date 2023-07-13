import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N, M, R;

    static boolean[] visited;

    static int[] visit;
    static ArrayList<Integer>[] list;

    static int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        visit = new int[N+1];
        list = new ArrayList[N+1];

        for (int i = 0; i <= N; i++) {
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
            Collections.sort(list[i], Collections.reverseOrder());
        }
        dfs(R);

        for (int i = 1; i < visit.length; i++) {
            sb.append(visit[i]).append('\n');
        }
        System.out.println(sb);
    }

    public static void dfs(int node) {

        visited[node] = true;
        visit[node] = count;
        
        for (int next : list[node]) {
            if(!visited[next]) {
                count++;
                dfs(next);
            }
        }
    }
}
