import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] N = new int[2];
        N[0] = Integer.parseInt(st.nextToken());
        N[1] = Integer.parseInt(st.nextToken());
        int[] arr = new int[N[0]];
        for (int i = 0; i < N[0]; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int coinNum = 0;
        int price = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            coinNum += N[1] / arr[i];
            N[1] = N[1] % arr[i];
        }
        System.out.println(coinNum);
    }
}