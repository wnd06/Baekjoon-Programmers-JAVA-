
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Scanner로 입력받지 않고,
 * BufferedReader, InputStreamReader, StringTokenizer
 * 를 통해 입력 받는 것 공부해오기
 */
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i : arr) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);

    }
}