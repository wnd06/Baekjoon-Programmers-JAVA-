
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                c += 13;
                int ascii = (int)c;
                if(!Character.isLowerCase(c)) {
                    c -= 26;
                }
                str += c;
            }
            else if (Character.isUpperCase(c)){
                c += 13;
                if(!Character.isUpperCase(c)) {
                    c -= 26;
                }
                str += c;
            }
            else
                str+=c;
        }
        System.out.println(str);
    }
}
