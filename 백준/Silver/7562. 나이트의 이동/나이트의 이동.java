import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] chess;
    static boolean[][] visited;
    static int N;
    static int[] dx = {-2, 2, -1, 1, -1, 2, 1, -2};
    static int[] dy = {1, -1, 2, -2, -2, 1, 2, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            N = Integer.parseInt(br.readLine());
            chess = new int[N][N];
            visited = new boolean[N][N];

            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            visited[startX][startY] = true;
            bfs(startX, startY, endX, endY);
            sb.append(chess[endX][endY]).append('\n');
        }
        System.out.println(sb);
    }

    public static void bfs(int startx, int starty, int endx, int endy) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {startx, starty});

        while(!q.isEmpty()) {
            int[] num = q.poll();
            int numX = num[0];
            int numY = num[1];

            if(numX == endx && numY == endy)
                return;

            for (int i = 0; i < 8; i++) {
                int nextX = numX + dx[i];
                int nextY = numY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N)
                    continue;
                if(visited[nextX][nextY])
                    continue;

                q.add(new int[] {nextX, nextY});
                chess[nextX][nextY] = chess[numX][numY] + 1;
                visited[nextX][nextY] = true;
            }
        }

    }
}
