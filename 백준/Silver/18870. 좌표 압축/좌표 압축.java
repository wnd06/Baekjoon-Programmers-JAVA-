import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    private static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        int [] sorted = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);
        int rank = 0;

        for (int i = 0; i < N; i++) {
            if(!map.containsKey(sorted[i])) {
                map.put(sorted[i], rank);
                rank++;
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(map.get(arr[i])).append(' ');
        }

        System.out.println(sb);

    }
}