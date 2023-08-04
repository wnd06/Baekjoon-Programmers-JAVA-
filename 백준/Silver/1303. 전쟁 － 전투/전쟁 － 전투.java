import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int countB;
    static int countW;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            for (int j = 0; j < M; j++) {
                if(a.charAt(j) == 'W') {
                    map[i][j] = 1;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 1) {
                    visited[i][j] = true;
                    bfs(i, j);
                    list.add(countW + 1);
                }
                else if(map[i][j] == 0) {
                    visited[i][j] = true;
                    bfs_2(i, j);
                    list_2.add(countB + 1);
                }
            }
        }
        result(list);
        result(list_2);
        System.out.println(sb);
    }

    private static void result(ArrayList<Integer> list) {
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            a += list.get(i) * list.get(i);
        }
        sb.append(a).append(" ");
    }

    private static void bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        countW = 0;
        q.add(new int[] {i, j});
        while(!q.isEmpty()) {
            int[] number = q.poll();
            int x = number[0];
            int y = number[1];
            for (int k = 0; k < 4; k++) {
                int nextX = x + dx[k];
                int nextY = y + dy[k];
                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;
                if(visited[nextX][nextY] || map[nextX][nextY] != 1)
                    continue;

                visited[nextX][nextY] = true;
                map[nextX][nextY] = map[x][y] + 1;
                q.add(new int[] {nextX, nextY});
                countW++;
            }
        }
    }
    private static void bfs_2(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        countB = 0;
        q.add(new int[] {i, j});
        while(!q.isEmpty()) {
            int[] number = q.poll();
            int x = number[0];
            int y = number[1];
            for (int k = 0; k < 4; k++) {
                int nextX = x + dx[k];
                int nextY = y + dy[k];
                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;
                if(visited[nextX][nextY] || map[nextX][nextY] != 0)
                    continue;

                visited[nextX][nextY] = true;
                map[nextX][nextY] = map[x][y] + 2;
                q.add(new int[] {nextX, nextY});
                countB++;
            }
        }
    }
}
