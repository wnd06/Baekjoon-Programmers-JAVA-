import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] money = new int[] {25, 10, 5, 1};
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            //arr[i] = D / 100.0;
            for (int j = 0; j < money.length; j++) {
                int count = 0;
                if(j == money.length - 1) {
                    count = (arr[i] / money[j]);
                    sb.append(count).append('\n');
                }
                else {
                    count = (int)(arr[i] / money[j]);
                    arr[i] = arr[i] % money[j];
                    sb.append(count).append(' ');
                }
            }
        }
        System.out.println(sb);

    }
}
