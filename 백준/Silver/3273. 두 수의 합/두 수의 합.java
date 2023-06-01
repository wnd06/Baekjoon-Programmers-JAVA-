import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int l = 0;
        int r = arr.length - 1;
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = Integer.parseInt(br.readLine());
        //정렬
        Arrays.sort(arr);
        while(l < r) {
            if(arr[l] + arr[r] == sum){
                count++;
            }
            if (arr[l] + arr[r] <= sum){
                l++;
            }
            else
                r--;
        }
        System.out.println(count);
    }
}