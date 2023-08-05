import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] c = new Integer[N];
        for (int i = 0; i < N; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(c, Collections.reverseOrder());
        int result = 0;
        for (int i = 1; i < N; i++) {
            result += c[0] + c[i];
        }
        System.out.println(result);
    }
}
