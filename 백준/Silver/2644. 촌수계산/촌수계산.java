import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static LinkedList<Integer>[] list;
    static boolean[] visited;
    static int[] visit;
    static int n, m;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new LinkedList[n + 1];
        visited = new boolean[n + 1];
        visit = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            list[i] = new LinkedList<>();
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        dfs(first, 0);
        if(visit[second] == 0)
            System.out.println(-1);
        else System.out.println(visit[second]);
    }

    private static void dfs(int first, int cnt) {
        visited[first] = true;
        count = cnt;
        visit[first] = count;

        for (int next : list[first]) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(next, cnt+1);
            }
        }
    }
}
