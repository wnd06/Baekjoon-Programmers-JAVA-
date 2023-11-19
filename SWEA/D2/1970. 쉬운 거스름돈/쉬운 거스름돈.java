import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            StringBuilder sb = new StringBuilder();
            int[] arr= {50000, 10000, 5000, 1000, 500, 100, 50, 10};
            int[] result = new int[8];
            int money = sc.nextInt();

            for (int j = 0; j < arr.length; j++) {
                if(money >= arr[j]) {
                    result[j] = money / arr[j];
                    money = money % arr[j];
                }
            }


            for (int j = 0; j < arr.length; j++) {
                sb.append(result[j]).append(" ");
            }
            System.out.println("#" + i);
            System.out.println(sb);

        }

    }
}