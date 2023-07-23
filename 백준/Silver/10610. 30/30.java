import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - '0']++;
            sum += s.charAt(i) - '0';
        }

        if((sum % 3 != 0) || !s.contains("0")){
            System.out.println("-1");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            while(arr[i] != 0){
                sb.append(i);
                arr[i]--;
            }
        }
        System.out.println(sb);

    }
}
