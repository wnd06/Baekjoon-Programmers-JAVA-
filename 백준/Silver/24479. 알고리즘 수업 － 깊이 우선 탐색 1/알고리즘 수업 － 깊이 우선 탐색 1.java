import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] list;
    static boolean[] Visited;
    static int[] visit;
    static int N, M, R;
    static int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        list = new ArrayList[N + 1];

        Visited = new boolean[N + 1];

        visit = new int[N + 1];

        for(int i = 0; i < N+1; i++) {
            list[i] = new ArrayList<>();
        }



        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(list.length != 0) {
                list[a].add(b);
                list[b].add(a);
            }
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(list[i]);
        }
        dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(visit[i]).append('\n');
        }
        System.out.println(sb);
    }

    public static void dfs(int node) {

        Visited[node] = true;
        visit[node] = count;
        for (int next : list[node]) {
            if(!Visited[next]){
                count++;
                dfs(next);
            }
        }
    }
}
