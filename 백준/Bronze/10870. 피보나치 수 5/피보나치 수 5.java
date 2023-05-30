import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibo(N));

    }
    public static int fibo(int n) {
        if(n <= 1)
            return n;
        else
            return fibo(n-2) + fibo(n-1);
    }
}