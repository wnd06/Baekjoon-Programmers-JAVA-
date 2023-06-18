import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        int[] arr_2 = new int[26];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
            arr_2[arr[i].charAt(0) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr_2.length; i++) {
            if(arr_2[i] >= 5){
                sb.append((char)(i + 'a'));
            }
        }
        if(sb.length() == 0)
            sb.append("PREDAJA");
        System.out.println(sb);

    }
}
