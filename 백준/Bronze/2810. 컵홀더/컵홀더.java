import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] arr = s.toCharArray();
        int count_S = 0;
        int count_L = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'S')
                count_S++;
            else
                count_L++;
        }
        result = count_S + (count_L / 2) + 1;

        if(result > N)
            result = N;

        System.out.println(result);
    }
}
