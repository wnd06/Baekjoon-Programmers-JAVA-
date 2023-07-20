import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        loop1:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;
                    q.add(new int[]{i, j});
                }
            }
        }

        System.out.println(bfs());

    }

    public static int bfs() {

        while (!q.isEmpty()) {
            int[] num = q.poll();
            int numX = num[0];
            int numY = num[1];


            for (int i = 0; i < 4; i++) {
                int nextX = numX + dx[i];
                int nextY = numY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;
                if (visited[nextX][nextY] || map[nextX][nextY] == -1)
                    continue;

                q.add(new int[]{nextX, nextY});
                map[nextX][nextY] = map[numX][numY] + 1;
                visited[nextX][nextY] = true;
            }
        }
        int max = 0;
        if (check() == -1)
            return -1;
        else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] > max)
                        max = map[i][j];
                }
            }
            return max - 1;
        }
    }

    public static int check() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0)
                    return -1;
            }
        }

        return 0;
    }

}
