import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int money = 1000 - N;
        int count = 0;

        {
            if (money / 500 >= 0) {
                count += (money / 500);
                money %= 500;
            }
            if (money / 100 >= 0) {
                count += (money / 100);
                money %= 100;
            }
            if (money / 50 >= 0) {
                count += (money / 50);
                money %= 50;
            }
            if (money / 10 >= 0) {
                count += (money / 10);
                money %= 10;
            }
            if (money / 5 >= 0) {
                count += (money / 5);
                money %= 5;
            }
            if (money / 1 >= 0) {
                count += (money / 1);
                money %= 1;
            }
        }
        System.out.println(count);
    }
}
