import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M, R;
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int[] visit;
    static int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        // 들어갈 만큼의 배열 할당
        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        visit = new int[N + 1];

        // Arraylist 초기화
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        //인접리스트 생성
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        //list 오름차순으로 바꾸기
        for (int i = 1; i < list.length; i++) {
            Collections.sort(list[i]);
        }

        bfs(R);
        
        //visit배열의 숫자 꺼내오기
        for (int i = 1; i < visit.length; i++) {
            sb.append(visit[i]).append('\n');
        }
        System.out.println(sb);

    }

    public static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();

        visited[node] = true;
        queue.add(node);

        while(queue.size() != 0) {

            int num = queue.poll();
            visit[num] = count++;

            for (int next : list[num]) {

                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

    }
}
