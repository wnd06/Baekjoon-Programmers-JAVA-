import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
            result = 0;
            sb.append(InPalindrome(arr[i])).append(" ").append(result).append('\n');
        }
        System.out.println(sb);

    }
    public static int recursion(int l, int r, String str) {

        if(l >= r) {
            result++;
            return 1;
        }
        else if(str.charAt(l) != str.charAt(r)) {
            result++;
            return 0;
        }
        else {
            result++;
            return recursion(l + 1, r - 1, str);
        }

    }
    public static int InPalindrome(String s) {
        return recursion(0, s.length()-1, s);
    }

}