import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Integer[] arr_2 = new Integer[arr[0]];
        for (int i = 0; i < arr_2.length; i++) {
            arr_2[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr_2,(e1, e2) -> {
            return e2 - e1;
        });
        sb.append(arr_2[arr[1] - 1]);
        System.out.println(sb);

    }

}