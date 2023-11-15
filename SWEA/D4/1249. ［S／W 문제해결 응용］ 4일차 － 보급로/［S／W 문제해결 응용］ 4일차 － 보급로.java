import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Solution {
	static int N, sum, min;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			min = Integer.MAX_VALUE;
			map = new int[N][N];
			visited = new boolean[N][N];
			
			for(int i = 0; i < N; i++) {
				String[] str = sc.next().split("");
				for(int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(str[j]);
				}
			}
			
			visited[0][0] = true;
			bfs(0,0);
			System.out.println("#" + test_case + " " + min);
			
		}
	}
	public static void bfs(int x, int y) {
		PriorityQueue<Pos> queue = new PriorityQueue<>();
		queue.add(new Pos(x, y, 0));
		
		while(!queue.isEmpty()) {
			Pos p = queue.poll();
			
			int numX = p.x;
			int numY = p.y;
			int curT = p.time;
			if(numX == N-1 && numY == N-1) {
				min = Math.min(min, curT);
			}
			
			for(int i = 0; i < 4; i++) {
				int nextX = numX + dx[i];
				int nextY = numY + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N)
					continue;
				if(visited[nextX][nextY])
					continue;
				int totalTime = curT + map[nextX][nextY];
				queue.add(new Pos(nextX, nextY, totalTime));
				visited[nextX][nextY] = true;
			}
		}
	}
	
	static class Pos implements Comparable<Pos>{
		int x, y;
		int time; // 복구하는 데 든 시간
		
		Pos(int x, int y, int time){
			this.x = x;
			this.y = y;
			this.time = time;
		}
		
		@Override
		public int compareTo(Pos o) { // 복구 시간이 작을 수록 우선순위가 높다.(오름차순 정렬 해야 함.)
			if(this.time < o.time) {
				return -1;
			} else if(this.time > o.time) {
				return 1;
			}
			return 0;
		}
	}

}
