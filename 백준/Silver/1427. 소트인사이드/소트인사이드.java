import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Scanner로 입력받지 않고,
 * BufferedReader, InputStreamReader, StringTokenizer
 * 를 통해 입력 받는 것 공부해오기
 */
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String s = br.readLine();
            int i = Integer.parseInt(s);
            char[] chs = s.toCharArray();
            for (int j = 1; j < chs.length; j++) {
                int target = (int)chs[j];
                int k = j - 1;
                while(k >= 0 && target < chs[k]) {
                    chs[k + 1] = chs[k];
                    k--;
                }
                chs[k+1] = (char)target;
            }
            for (int j = chs.length-1; j >= 0; j--) {
                System.out.print(chs[j]);
            }

//            StringTokenizer st = new StringTokenizer(s);
//            int a = Integer.parseInt(st.nextToken());

        } catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}