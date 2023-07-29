import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int num = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            q.add(arr[i]);
        }
        while(q.size() > 1) {
            int temp1 = q.poll();
            int temp2 = q.poll();

            sum += temp1 + temp2;
            q.add(temp1 + temp2);
        }
        System.out.println(sum);
    }
}
