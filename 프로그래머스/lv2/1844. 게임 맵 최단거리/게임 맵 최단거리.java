import java.util.*;
class Solution {
    
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int n, m;
    boolean[][] visited;
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        n = maps.length;
        m = maps[0].length;
        
        visited = new boolean[n][m];
        visited[0][0] = true;
        bfs(maps);
        
        answer = maps[n - 1][m - 1];
        
        if(answer == 1)
            answer = -1;
        
        return answer;
    }
    
    public void bfs(int[][] maps) {
        int x = 0;
        int y = 0;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        
        while(!q.isEmpty()) {
            
            int[] num = q.poll();
            int numX = num[0];
            int numY = num[1];
            
            for(int i = 0; i < 4; i++) {
                int nextX = numX + dx[i];
                int nextY = numY + dy[i];
                
                if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
                    continue;
                if(visited[nextX][nextY] || maps[nextX][nextY] == 0)
                    continue;
                
                q.add(new int[] {nextX, nextY});
                visited[nextX][nextY] = true;
                maps[nextX][nextY] = maps[numX][numY] + 1;
                
            }
        }
    }
}