import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Queue;

public class Main {
    static int M, N, K;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        visited = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    map[j][k] = 1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j] == 0) {
                    count++;
                    visited[i][j] = true;
                    bfs(i, j);
                    list.add(cnt + 1);
                }
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    static void bfs(int a, int b) {
        Queue<int[]> q = new LinkedList<>();
        cnt = 0;
        q.add(new int[] {a, b});
        while(!q.isEmpty()) {
            int[] num = q.poll();
            int x = num[0];
            int y = num[1];
            for (int i = 0; i < 4; i++) {
                int nextx = x + dx[i];
                int nexty = y + dy[i];
                if(nextx < 0 || nexty < 0 || nextx >= M || nexty >= N)
                    continue;
                if(visited[nextx][nexty] || map[nextx][nexty] == 1)
                    continue;
                q.add(new int[] {nextx, nexty});
                map[nextx][nexty] = map[x][y] + 1;
                visited[nextx][nexty] = true;
                cnt++;
            }
        }
    }
}
