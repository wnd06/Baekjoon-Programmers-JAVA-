import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            int a = Integer.parseInt(br.readLine());
            int[][] arr = new int[a][2];
            for (int j = 0; j < a; j++) {
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, (o1, o2) -> {
                return o1[0] - o2[0];
            });

            int num = arr[0][1];
            int count = 1;
            for (int j = 1; j < a; j++) {
                if(num > arr[j][1]) {
                    count++;
                    num = arr[j][1];
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }

}