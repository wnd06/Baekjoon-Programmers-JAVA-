import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Queue;

public class Main {

    static int N;

    static int[][] map;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean[][] visited;

    static int count;

    static ArrayList<Integer> list = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j] == 1) {
                    count = 1;
                    visited[i][j] = true;
                    bfs(i, j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

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

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N)
                    continue;
                if(map[nextX][nextY] == 0 || visited[nextX][nextY])
                    continue;

                q.add(new int[]{nextX, nextY});
                map[nextX][nextY] = map[numX][numY] + 1;
                count++;
                visited[nextX][nextY] = true;
            }
        }
    }
}
