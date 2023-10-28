import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[T][10];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] % 2 != 0) {
                    sum += arr[i][j];
                }
            }
            
            sb.append("#").append(i + 1)
                    .append(" ")
                    .append(sum)
                    .append("\n");
        }
        System.out.print(sb);
    }
}