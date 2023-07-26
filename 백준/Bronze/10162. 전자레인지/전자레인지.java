import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[] {300, 60, 10};
        for (int i = 0; i < 3; i++) {
            int count = 0;
            count = N / arr[i];
            N %= arr[i];
            sb.append(count).append(' ');
        }
        if(N != 0)
            System.out.println(-1);
        else
            System.out.println(sb);

    }
}
