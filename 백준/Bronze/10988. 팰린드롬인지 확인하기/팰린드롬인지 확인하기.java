

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = 0;
        int j = s.length()-1;

        System.out.println(palindrome(i, j, s));
    }
    public static int palindrome(int i, int j, String s) {
        if(i >= j){
            return 1;
        }
        else if(s.charAt(i) != s.charAt(j)){
            return 0;
        }
        else {
            return palindrome(i+1, j-1, s);
        }
    }
}
