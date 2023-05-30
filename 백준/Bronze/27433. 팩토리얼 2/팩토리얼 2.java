import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long result = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        fact(N);
        System.out.println(result);
    }
    public static int fact(int n) {
        if(n == 0)
            return 0;
        else {
            result *= n;
            return fact(n - 1);
        }
    }
}