import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] miro;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0 ,0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        miro = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                miro[i][j] = s.charAt(j) - '0';
            }
        }

        visited[0][0] = true;
        bfs(0,0);

        System.out.println(miro[N - 1][M - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        while(!q.isEmpty()) {

            int[] num = q.poll();
            int numX = num[0];
            int numY = num[1];

            for (int i = 0; i < dx.length; i++) {
                int nextX = numX + dx[i];
                int nextY = numY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;

                if(visited[nextX][nextY] || miro[nextX][nextY] == 0)
                    continue;

                q.add(new int[] {nextX, nextY});
                visited[nextX][nextY] = true;
                miro[nextX][nextY] = miro[numX][numY] + 1;
            }
        }
    }
}
