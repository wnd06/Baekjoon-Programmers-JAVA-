
import java.io.*;
import java.util.*;

/**
 * Scanner로 입력받지 않고,
 * BufferedReader, InputStreamReader, StringTokenizer
 * 를 통해 입력 받는 것 공부해오기
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[1] == e2[1])
                return e1[0] - e2[0];
            return e1[1] - e2[1];
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
//
}


//    public static void main(String[] args) throws IOException{ // 백준 수 정렬하기 2
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int N = Integer.parseInt(br.readLine());
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < N; i++) {
//            arr.add(Integer.parseInt(br.readLine()));
//        }
//        Collections.sort(arr);
//
//        for (int i : arr) {
//            sb.append(i).append('\n');
//        }
//
//        System.out.println(sb);
//
//    }