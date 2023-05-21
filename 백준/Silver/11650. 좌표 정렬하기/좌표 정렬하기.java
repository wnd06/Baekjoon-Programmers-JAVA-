import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int [N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(e1, e2) -> {
            if(e1[0] == e2[0])
                return e1[1] - e2[1];
            else
                return e1[0] - e2[0];
        });

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(' ');
            sb.append(arr[i][1]).append('\n');
        }
        System.out.println(sb);

    }

}