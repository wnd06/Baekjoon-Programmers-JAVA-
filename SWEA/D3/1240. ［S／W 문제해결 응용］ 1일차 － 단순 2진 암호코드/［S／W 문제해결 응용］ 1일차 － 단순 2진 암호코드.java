import java.io.*;
import java.util.*;

class Solution {
    static String[] code = {"0001101", "0011001", "0010011", "0111101", "0100011",
                            "0110001", "0101111", "0111011", "0110111", "0001011"};
    static String result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

//        String[] arr = new String[N];

        for (int index = 0; index < T; index++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] password = new int[8];
            int result = 0;
            for (int i = 0; i < N; i++) {
                String line = br.readLine();
                for (int j = M - 1; j >= M - 56 -1; j--) {
                    if(line.charAt(j) == '1') {
                        int a = 0;
                        for (int k = j - 55; k <= j; k += 7) {
                            String decryptionCode = line.substring(k, k + 7);
                            password[a++] = search(decryptionCode);
                        }
                        break;
                    }

                }
            }
            if(check(password)) {
                for (int k = 0; k < password.length; k++) {
                    result += password[k];
                }
            }
            else {
                result = 0;
            }
            System.out.println("#" + (index + 1) + " " + result);
        }
    }

    public static int search(String decryptionCode) {
        for (int i = 0; i < code.length; i++) {
            if(decryptionCode.equals(code[i])) {
                return i;
//                System.out.println(result);
            }
        }
        return 0;
    }

    public static boolean check(int[] password) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < password.length; i++) {
            if(i % 2 == 0) {
                even += password[i];
            }
            else {
                odd += password[i];
            }
        }
        if(((3 * even) + odd) % 10 == 0)
            return true;

        return false;
    }
}
