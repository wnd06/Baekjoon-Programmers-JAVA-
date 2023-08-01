import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        long result = 0;
        for (int i = 0; i < N; i++) {
            arr[i] -= A;
            result++;
        }
        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            num = arr[i] / B;

            if(arr[i] > 0) {
                if(arr[i] % B == 0)
                    result += num;
                else if(arr[i] < B)
                    result++;
                else result += 1 + num;
            }
        }
        System.out.println(result);
    }
}
