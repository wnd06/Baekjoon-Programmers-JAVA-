import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int money = 1000 - N;
        int count = 0;

        int[] coin = new int[] {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < coin.length; i++) {
            count += money / coin[i];
            money %= coin[i];
        }
        System.out.println(count);
    }
}
