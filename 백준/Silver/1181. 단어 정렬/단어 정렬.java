import java.io.*;
import java.nio.Buffer;
import java.util.*;

/**
 * Scanner로 입력받지 않고,
 * BufferedReader, InputStreamReader, StringTokenizer
 * 를 통해 입력 받는 것 공부해오기
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String [] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, (e1, e2) -> {
            if(e1.length() == e2.length())
                return e1.compareTo(e2);
            else
                return e1.length() - e2.length();
        });

        sb.append(arr[0]).append('\n');
        for (int i = 1; i < N; i++) {
            if(!arr[i].equals(arr[i-1]))
                sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);

    }

}
