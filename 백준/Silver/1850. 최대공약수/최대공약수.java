import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        long first = Long.parseLong(st.nextToken());
        long second = Long.parseLong(st.nextToken());
        if(first < second) {
            long temp;
            temp = second;
            second = first;
            first = temp;
        }

        long num = gcd(first, second);
        for (long i = 0; i < num; i++) {
            sb.append(1);
        }
        System.out.println(sb);
    }

    private static long gcd(long i, long j) {
        if(j == 0)
            return i;
        else
            return gcd(j, i % j);
    }
}
