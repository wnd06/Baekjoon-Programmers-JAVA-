import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int N;
    static int[][] matrix;
    static boolean[][] visited;
    static boolean three;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int test = sc.nextInt();
            three = false;
            N = 16;
            matrix = new int[N][N];
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                String[] str = sc.next().split("");
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = Integer.parseInt(str[j]);
                }
            }
            bfs(1, 1);
            if (three) {
                System.out.println("#" + test + " " + 1);
            }
            else {
                System.out.println("#" + test + " " + 0);
            }
        }
    }
    public static void bfs(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        while(!q.isEmpty()) {
            int[] num = q.poll();
            int numX = num[0];
            int numY = num[1];

            if(matrix[numX][numY] == 3)
                three = true;
            for (int i = 0; i < 4; i++) {
                int nextX = numX + dx[i];
                int nextY = numY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N)
                    continue;
                if(visited[nextX][nextY] || matrix[nextX][nextY] == 1)
                    continue;
                bfs(nextX, nextY);
            }

        }
    }
}