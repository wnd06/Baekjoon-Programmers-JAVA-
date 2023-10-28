import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int result = 0;
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 2; j < arr.length - 2; j++) {
                int building = arr[j];
                int max = Math.max(arr[j - 2], Math.max(arr[j - 1], Math.max(arr[j + 1], arr[j + 2])));
                if(building < max) {
                    continue;
                } else {
                  result += (building - max);
                }
            }
            System.out.println("#" + (i+1) + " " + result);
        }
    }
}
