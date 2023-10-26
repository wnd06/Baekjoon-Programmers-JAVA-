import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long result = 0;
            int max = 0;
            for (int j = arr.length - 1; j >= 0; j--) {
                if(max < arr[j]) {
                    max = arr[j];
                }
                else {
                    result += max - arr[j];
                }
            }
            sb.append("#")
                    .append((i + 1))
                    .append(" ")
                    .append(result)
                    .append("\n");
        }
        System.out.print(sb);
    }
}