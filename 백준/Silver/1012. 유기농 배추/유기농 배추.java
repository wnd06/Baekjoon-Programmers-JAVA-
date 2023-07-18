import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count;
    static int M, N;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            map = new int[M][N];
            visited = new boolean[M][N];
            count = 0;

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }
            //지렁이 찾기
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if(map[j][k] == 1 && !visited[j][k]) {
                        visited[j][k] = true;
                        count++;
                        dfs(j, k);
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);

    }
    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        while(!q.isEmpty()) {
            int[] num = q.poll();
            int numX = num[0];
            int numY = num[1];

            for (int i = 0; i < 4; i++) {
                int nextX = numX + dx[i];
                int nextY = numY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N)
                    continue;
                if(map[nextX][nextY] == 0 || visited[nextX][nextY])
                    continue;

                q.add(new int[] {nextX, nextY});
                map[nextX][nextY] = map[numX][numY] + 1;
                visited[nextX][nextY] = true;

            }
        }
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N)
                continue;
            if(map[nextX][nextY] == 0 || visited[nextX][nextY])
                continue;

            dfs(nextX, nextY);
        }
    }
}
